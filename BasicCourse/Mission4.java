package BasicCourse;
//containsKey(String) 해당 키가 존재하는지 판단해서 Bool 결과를 리턴한다.
//
//get(String) 해당 키와 매치되는 값을 찾아서 리턴한다.
//
//isEmpty() 비어있는 맵인지 Bool 결과를 리턴한다.
//
//keys() 전체 키 목록을 [String] 배열로 리턴한다.
//
//put(String key, String value) 키-값을 추가한다.
//
//remove(String key) 해당 키에 있는 값을 삭제한다.
//
//size() 전체 아이템 개수를 리턴한다.
//해시맵 키 값이 문자열이 아니라 다른 타입이라면 어떤 부분이 어떻게 바뀌는지 살펴본다
class Node {
    String key;
    String value;
    Node next;
}

public class Mission4 {
    List<String> keys() {
        List<String> result = new ArrayList<>();
        for (Node head : buckets) {
            Node curr = head;
            while (curr != null) {
                result.add(curr.key);
                curr = curr.next;
            }
        }
        return result;
    }
    void put(String key, String value) {
        int index = getIndex(key);
        Node curr = buckets[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }


}


