/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.icecreamparlor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AbdElHalim
 */
public class IceCream {

    public static void main(String[] args) {
        whatFlavors(new int[]{1, 2, 3, 5, 6}, 5);
    }

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        int[] result = new int[2];
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            int x = cost[i];
            int y = money - x;
            Integer j = map.get(y);
            if (j != null) {
                result[0] = j + 1;
                result[1] = i + 1;
                break;
            }
            map.put(x, i);

        }
        System.out.println(result[0] + " " + result[1]);
    }
}
