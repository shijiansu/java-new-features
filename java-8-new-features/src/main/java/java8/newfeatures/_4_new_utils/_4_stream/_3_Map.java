package java8.newfeatures._4_new_utils._4_stream;

import java.util.HashMap;
import java.util.Map;

// Map类型不支持stream
public class _3_Map {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      map.putIfAbsent(i, "val" + i);
    }
    map.forEach((id, val) -> System.out.println(val));

    map.computeIfPresent(3, (num, val) -> val + num);
    System.out.println(map.get(3)); // val33

    map.computeIfPresent(9, (num, val) -> null); // 返回null
    map.containsKey(9); // false

    map.computeIfAbsent(23, num -> "val" + num);
    map.containsKey(23); // true

    map.computeIfAbsent(3, num -> "bam");
    map.get(3); // val33

    map.remove(3, "val3");
    map.get(3); // val33

    map.remove(3, "val33");
    map.get(3); // null

    map.getOrDefault(42, "not found"); // not found

    // 合并
    map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
    map.get(9); // val9
    map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
    map.get(9); // val9concat
  }
}
