import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Task> list = new LinkedList<Task>();
		Calendar c1 = Calendar.getInstance();
		c1.set(2019, 10, 11);
		Calendar c2 = Calendar.getInstance();
		c2.set(2019, 9, 15);
		list.add(new Task("read", c1, 1));
		list.add(new Task("wash", c2, 3));
		Task task3 = new Task("work", Calendar.getInstance(), 1);
		task3.done();
		list.add(task3);

		Comparator<Task> compDate = (task1, task2) -> task1.getDueDate().compareTo(task2.getDueDate());
		Comparator<Task> compDue = (task1, task2) -> Integer.compare(task1.getEstimatedTime(),
				task2.getEstimatedTime());

		// 1
		Collections.sort(list, compDate);
		System.out.println(list);
		// [2 work : 12/4/2019, 1 wash : 15/9/2019, 0 read : 11/10/2019]
		Collections.sort(list, compDue);
		System.out.println(list);
		// [2 work : 12/4/2019, 0 read : 11/10/2019, 1 wash : 15/9/2019]

		// 2
		list.forEach(t -> System.out.println(t.getId()));
		// 2 0 1
		list.forEach(t -> System.out.println(t.getEstimatedTime()));
		// 1 1 3

		// 1) Tester s’il existe une tache terminée.
		Boolean bol = list.stream().anyMatch(t -> t.isDone());
		System.out.println(bol);
		// true

		// 2) Déterminer le nombre de taches non terminées
		// filter过滤满足条件的task
		long num = list.stream().filter(t -> t.isDone() == false).count();
		System.out.println(num);
		// 2

		// 3) Afficher les labels de toutes les tâches.
		List<String> doneTask = list.stream().map(t -> t.getLabel()).collect(Collectors.toList());
		System.out.println(doneTask);
		// [work, read, wash]

		// 4) Afficher l’id de toutes les tâches qui ont une durée estimée supérieure à
		// 2 jours.
		list.stream().map(t -> t.getLabel()).forEach(System.out::println);
		// work read wash
		// ou
		List<String> s = list.stream().map(t -> t.getLabel()).collect(Collectors.toList());
		System.out.println(s);
		// [work, read, wash]

		// 5) Affiche la tâche qui est la plus proche de la date courante
		Calendar newCal = Calendar.getInstance();
		System.out.println(list.stream().min((t3, t2) -> t3.getDueDate().compareTo(newCal)));
		// Optional[2 work : 12/4/2019]

		Task k = list.stream().min((t3, t2) -> t3.getDueDate().compareTo(newCal)).orElse(null);
		System.out.println(k);
		// 2 work : 12/4/2019

		// 6) Calculer le total des durées estimées pour toutes les tâches non
		// terminées.

		Integer sum = list.stream().filter(t -> t.isDone() == false).mapToInt((t) -> t.getEstimatedTime()).sum();
		System.out.println(sum);
		// 4

		// 7) Calculer le total des durees estimees en heurs pour toutes les taches non
		// terminees
		Long duree = list.stream().filter(t -> t.isDone() == false).mapToLong(t -> t.getEstimatedTime()).sum();
		System.out.println(duree);
		// 4

		// 6)Retourne une chaine constituee de tous les labels en utilisant reduce
		// String s1 = list.stream().map(t -> t.getLabel()).reduce( (t1, t2) -> t1 +" "
		// +t2).get();
		String s1 = list.stream().map(t -> t.getLabel()).reduce("first param", (t1, t2) -> t1 + " " + t2);
		System.out.println(s1);
		// first param work read wash

		// 7) Construire une liste des tâches terminées.
		List<Task> taskTerm = list.stream().filter(t -> t.isDone()).collect(Collectors.toList());
		System.out.println(taskTerm);
		// [2 work : 12/4/2019]

		// 8) Construire une partition des tâches terminées et non terminées
		// list.stream().filter(!(t->t.isDone())).collect(Collectors.toList());
		Map<Boolean, List<Task>> partition = list.stream().collect(Collectors.partitioningBy(t -> t.isDone()));
		List<List<Task>> subList = new ArrayList<List<Task>>(partition.values());
		List<Task> taskDone = subList.get(1);
		List<Task> taskNdone = subList.get(0);
		System.out.println(taskDone);
		System.out.println(taskNdone);
		// [2 work : 12/4/2019]
		// [0 read : 11/10/2019, 1 wash : 15/9/2019]

		// solution 2
		list.stream().collect(Collectors.groupingBy(Task::isDone, Collectors.toList())).forEach((done, ListByDone) -> {
			boolean Done = done;
			String ss = ListByDone.stream().map(t -> t.getLabel()).reduce((Done) ? "Y" : "N",
					(t1, t2) -> t1 + "," + t2);
			System.out.println(ss);
		});
		// N,read,wash
		// Y,work

		List<Task> f2 = taskWhile(list, t -> t.isDone());
		System.out.println(f2);
		// [2 work : 12/4/2019]

		// //dans un map, le cle est unique(on peut pas avoir deux tache avec un meme
		// estimatedtime dans cle)
		Map<String, Integer> f3 = listToMap(list, t -> t.getLabel(), t -> t.getEstimatedTime());
		System.out.println(f3);
		// {read=1, work=1, wash=3}

		Map<Integer, String> f4 = listToMap(list, t -> t.getId(), t -> t.getLabel());
		System.out.println(f4);
		// {0=read, 1=wash, 2=work}

	}

	public static List<Task> taskWhile(List<Task> l, Predicate<Task> pre) {
		List<Task> retour = l.stream().filter(pre).collect(Collectors.toList());
		return retour;
	}

	public static <T> List<T> taskWhile2(List<T> l, Predicate<T> pre) {
		List<T> retour = l.stream().filter(pre).collect(Collectors.toList());
		return retour;
	}

	public static <K, V> Map<K, V> taskToMap(List<Task> l, Function<Task, K> f1, Function<Task, V> f2) {
		Map<K, V> map = new HashMap();
		for (Task t : l) {
			K key = f1.apply(t);
			V value = f2.apply(t);
			map.put(key, value);
		}
		return map;
	}

	public static <K, V, T> Map<K, V> listToMap(List<T> l, Function<T, K> f1, Function<T, V> f2) {
		Map<K, V> map = new HashMap();
		for (T t : l) {
			K key = f1.apply(t);
			V value = f2.apply(t);
			map.put(key, value);
		}
		return map;
	}
}
