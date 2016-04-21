import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sunxuan on 4/21/16.
 */

public class Main {
    public static void main (String args[]) throws Exception {


        int V;
        int E;
        int m;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> edgesConnectArrayList = new ArrayList<Integer>();

        ArrayList<Integer> integerArrayListFirst = readLineInteger(1, bufferedReader);


        V = integerArrayListFirst.get(0); //这几部分应该没有问题

//        System.out.println("This is V(n) value:" + V);

        ArrayList<Integer> integerArrayListSecond = readLineInteger(1,bufferedReader);

        E = integerArrayListSecond.get(0);

//        System.out.println("This is E(s) value"+ E);

        ArrayList<Integer> integerArrayListThird = readLineInteger(1,bufferedReader);

        m = integerArrayListThird.get(0);

            for (int i=0;i<E;i++) { //获取边的 连接情况
                ArrayList<Integer> tempList = readLineInteger(1, bufferedReader);
//                System.out.println("This is list:"+tempList);

                int size = tempList.size();
                int x = (tempList.get(0))/10;
//                System.out.println("This is x :"+x);
                int y = (tempList.get(size - 1))%10;
//                System.out.println("This is y:" +y);
//            edgesConnect tempConnect = new edgesConnect();
                Integer tempTable2 = new edgesConnect().multiPly(x, y);
                edgesConnectArrayList.add(tempTable2);
            }

        System.out.println(V+" "+E+" "+(m+1));

        for (int i=0;i<V;i++){ // 第二部分 关于 Constraints of type 1 (for each role): r t can be played by p 1 , p 2 , p 6
//            System.out.print((m+1)+" ");
//            for (int j=0;j<m+1;j++){
//                System.out.print(1+" ");
//            }
//            System.out.print("\n");
            System.out.print((m+1)+" ");
            for (int j=0;j<m+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.print("\n");
        }


//        for (int i=0;i<edgesConnectArrayList.size();i++){
//            System.out.println("!!!!!!!!!!!!!!!!!!!!"+edgesConnectArrayList.get(i));
//        }

        for (int i=0;i<E;i++){ //关于第三部分 Constraints of type 2 (for each scene): in s u the roles r 1 , r 3 , r 5 , r 6 and r 7 play
            if (edgesConnect.getNewx(edgesConnectArrayList.get(i))<edgesConnect.getNewy(edgesConnectArrayList.get(i))) {
                System.out.println(2 + " " + edgesConnect.getNewx(edgesConnectArrayList.get(i)) + " " + edgesConnect.getNewy(edgesConnectArrayList.get(i)));
            }else
                System.out.println(2 + " " + edgesConnect.getNewy(edgesConnectArrayList.get(i)) + " " + edgesConnect.getNewx(edgesConnectArrayList.get(i)));
        }

    }

    private static ArrayList<Integer> readLineInteger(int lineNum, BufferedReader bufferedReader) throws Exception { //read the line
        String lineString = "";
        String[] tempString ;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        while (i < lineNum) {
            lineString = bufferedReader.readLine();
            i++;
        }
        lineString = lineString.replaceAll(" ",""); //清除了所有的空格
        tempString = lineString.split(" ");

        for (String aTempString : tempString) {
            arrayList.add(Integer.valueOf(aTempString));
        }
        return arrayList;
    }

}
