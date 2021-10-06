package part5.composite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");


        List<Directory> basicDirs = Arrays.asList(
                new Directory("bin"),
                new Directory("tmp"),
                new Directory("usr")
        );

        List<Directory> userDirs = Arrays.asList(
                new Directory("user1"),
                new Directory("user2"),
                new Directory("user3")
        );

        basicDirs.forEach(rootDir::add);
        userDirs.forEach(rootDir::add);

        File viFile = new File("vi", 10000);
        File cFile = new File("c", 20000);
        basicDirs.get(0).add(viFile);
        basicDirs.get(0).add(cFile);

        File javaFile = new File("java",1500);
        File jsFile = new File("js",300);
        userDirs.get(0).add(javaFile);
        userDirs.get(0).add(jsFile);

        rootDir.printList();


        /*
        *
        *  <등장 인물>
        *  1. Leaf (File class)
        *  2. Composite ( Directory class)
        *  3. Component ( Leaf와 Composite의 공통 상위 클래스, Entry class)
        *  4. 이를 사용하는 클래스
        *
        * 재귀적인 파일,디렉토리 용량 출력을 이렇게 짜니까 되게 깔끔하긴 하다.
        * 하지만 디자인패턴의 실용성에 의구심이 드는 건 여전하다.
        * 그래도 디자인 패턴의 사상을 느껴보려 노력하자.
        *
        * Composite 패턴 : 그릇과 내용물을 동일시하여 재귀적인 구조를 만들기 위한 디자인 패턴..?
        * 트리 구조로 된 데이터는 Composite 패턴에 해당..?
        *
        *
        * */
    }
}

