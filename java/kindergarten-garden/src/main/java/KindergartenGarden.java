import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by edi on 25.07.17.
 */
public class KindergartenGarden {

    String[] plants;
    String[] students;

    public KindergartenGarden(String plants, String... students) {
        this.plants = plants.split("\n");
        this.students = students;
    }

    public List<Plant> getPlantsOfStudent(String student) {
        int index;
        if(students.length == 0) index = student.codePointAt(0) - 65;
        else { Arrays.sort(students, Comparator.naturalOrder()); index = Arrays.asList(students).indexOf(student); };
        return Arrays.stream(plants)
                .flatMap(s -> Stream.of(s.charAt(index * 2), s.charAt(index * 2 + 1)))
                .map(Plant::getPlant)
                .collect(Collectors.toList());
    }
}
