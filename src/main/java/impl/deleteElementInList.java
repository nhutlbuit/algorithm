package impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class deleteElementInList {
    public static void deleteElementInList() {
        List<Person> listStudent = new CopyOnWriteArrayList<Person>();
        listStudent.add(new Person("a", "nam"));
        listStudent.add(new Person("b", "nu"));
        listStudent.add(new Person("c", "nam"));
        listStudent.add(new Person("d", "nu"));
        listStudent.add(new Person("e", "nam"));
        listStudent.add(new Person("f", "nu"));

//		for(int i =0; i <listStudent.size(); i++) {
//			if("nu".equals(listStudent.get(i).getGioitinh())) {
//				listStudent.remove(i);
//				System.out.println(listStudent.size());
//				System.out.println(i);
//			}
//		}

        for(Person e: listStudent) {
            if("nu".equals(e.getGioitinh())) {
                listStudent.remove(e);
            }
        }

//		Iterator<Person> iter = listStudent.iterator();
//		while(iter.hasNext()){
//			Person person = iter.next();
//			if("nu".equals(person.getGioitinh())) {
//				iter.remove();
//			}
//		}
        listStudent.forEach(obj -> System.out.println("name: " + obj.getName() +" gioi tinh: " + obj.getGioitinh()));
    }

    public static class Person {
        String name;
        String gioitinh;
        public Person (String name, String gt){
            this.name = name;
            this.gioitinh = gt;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGioitinh() {
            return gioitinh;
        }
        public void setGioitinh(String gioitinh) {
            this.gioitinh = gioitinh;
        }

    }

}
