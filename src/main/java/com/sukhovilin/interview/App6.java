package com.sukhovilin.interview;

import java.net.SocketTimeoutException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class App6 {

    public static void main(String[] args) throws Exception {
//        System.out.println(
//                ">>" + new App6().longestCommonPrefix(new String[]{"a"})
//        );

//        System.out.println(
//                new App6().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}) //
//        );
        System.out.println(
                new App6().climbStairs(5) // 10101
        );



    }

    // 3 = 3
    // 4 = 5
    // 5 = 8

    int f(int n) {
        int x1 = 1, x2 = 1, res = 1;
        for (int i = 2; i < n; i++) {
            res = x1 + x2;
            x1 = x2;
            x2 = res;

        }
        return res;
    }

    public int climbStairs(int n) {
        List<Integer> list = new ArrayList<>();
        req(n, list);
        AtomicBoolean r = new AtomicBoolean();
        return -1;


    }

//    int req(int n) {
//        if (n <= 1) return n;
//        return req(n - 2) + req(n - 1);
//    }

    void req(int n, List<Integer> list) {

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        if (n > sum) {
            if (n >= sum + 1) {
                list.add(1);
                req(n, list);
            }
            if (n >= sum + 2) {
                list.add(2);
                req(n, list);
            }
        }

        if (n == sum) {
            System.out.println(n + " " + sum + " " + list);
        }
    }

    void req1(int n, int a, int step) {

        if (n > a) {
            req1(n, a + step, 1);
            req1(n, a + step, 2);
        } else if (n == a) {
            System.out.println("!" + step);
        }
    }


    public boolean isHappy(int n) throws InterruptedException {

        n = 1999999999;

        while (n > 0) {

        }

        return true;
    }

    public boolean isHappy1(int n) throws InterruptedException {

        n = 2;
        Set<Integer> set = new HashSet<>();
        while (set.add(n = calc(n))) {
            if (n == 1) return true;
        }
        return false;
//        do {
//            n = calc(n);
//            if (!set.add(n)) return false;
//        } while (n != 1);
//        return true;

    }

    int calc(int n) {
        int r = 0;
        while (n > 0) {
            int num = n % 10;
            r += num * num;
            n /= 10;
        }
        return r;
//        int r = 0, t = n;
//        long x = 1;
//        while (n >= x) {
//            x *= 10;
//            int a = t % 10;
//            t /= 10;
//            r += a * a;
//        }
//        return r;
    }

    public int hammingWeight(int n) {
        n = Integer.parseInt("00000000000000000000000000001011", 2);


        System.out.println("n=" + n);

        int c = 0;
        for (int i = 0; i < 32; i++) {
            int m = 1 << i;
            if ((n & m) == m) c++;
        }


        return c;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = new ArrayList<>();


        return list;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> list = new ArrayList<>();

        int[] count = new int[nums.length];
        for (int num : nums) count[num - 1] = 1;

        for (int i = 0, len = count.length; i < len; i++)
            if (count[i] == 0) list.add(i + 1);


        return list;
    }

    public List<Integer> findDisappearedNumbers1(int[] nums) {

        nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        nums = new int[]{1, 1};

        //

        HashSet<Integer> list = new HashSet<>();

        for (int i = 1; i <= nums.length; i++) {
            list.add(i);
        }

        for (int num : nums) {
            list.remove(num);
        }

        return new ArrayList<>(list);

    }

    public String addBinary(String a, String b) {

        if (System.currentTimeMillis() > (1 + 1 - 1)) {
            a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
            b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        }


//        if (al > bl) {
//            b = "0".repeat(al - bl) + b;
//        } else if (bl > al) {
//            a = "0".repeat(bl - al) + a;
//            len = bl;
//        }

        StringBuilder sb = new StringBuilder();

        boolean flag = false;
        int ai = a.length() - 1;
        int bi = b.length() - 1;

        while (ai >= 0 || bi >= 0) {

            char x = ai >= 0 ? a.charAt(ai) : '0';
            char y = bi >= 0 ? b.charAt(bi) : '0';
            char r = '0';

            if (x == '1' && y == '1' && flag) {
                r = '1';
            } else if (x == '1' && y == '1') {
                flag = true;
            } else if ((x == '1' || y == '1') && !flag) {
                r = '1';
            } else if ((x != '1' && y != '1') && flag) {
                r = '1';
                flag = false;
            } else {
                r = '0';
            }

            sb.insert(0, r);
            ai--;
            bi--;
        }
        if (flag) sb.insert(0, '1');
        System.out.println("11101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000");
        return sb.toString();
    }

    public String addBinary1(String a, String b) {

        if (System.currentTimeMillis() > (1 + 1 - 1)) {
            a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
            b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        }


        int al = a.length();
        int bl = b.length();
        int len = al;

        if (al > bl) {
            b = "0".repeat(al - bl) + b;
        } else if (bl > al) {
            a = "0".repeat(bl - al) + a;
            len = bl;
        }

        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        for (int i = len - 1; i >= 0; --i) {

            boolean x = a.charAt(i) == '1';
            boolean y = b.charAt(i) == '1';
            char r = '0';

            if (x && y && flag) {
                r = '1';
            } else if (x && y) {
                flag = true;
            } else if ((x || y) && !flag) {
                r = '1';
            } else if ((!x && !y) && flag) {
                r = '1';
                flag = false;
            }

            sb.insert(0, r);

        }
        if (flag) sb.insert(0, '1');


        return sb.toString();
    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; --i) {
            int t = digits[i];
            if (t == 9) {
                digits[i] = 0;
            } else {
                t++;
                digits[i] = t;
                break;
            }
            //System.out.println();
        }
        if (digits[0] == 0) { // overflow
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            System.arraycopy(digits, 0, answer, 1, digits.length);
            return answer;
        }
        return digits;


    }

    public int removeDuplicates(int[] nums) {
        nums = new int[]{1, 1, 2};
        nums = new int[]{-1, 0, 0, 0, 0, 3, 3};

        int p = 0;
        int u = 0;


        while (p < nums.length && u < nums.length - 1) {

            if (p < nums.length - 1 && nums[p] == nums[u]) {

                if (u < p) u = p + 1;
                while (u < nums.length - 1 && nums[p] == nums[u]) {
                    u++;
                }

                nums[p + 1] = nums[u];

            } else p++;
            p++;

        }

        int c = -101;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= c) {
                System.out.println(">" + i);
            }
            c = nums[i];
        }

        System.out.println(Arrays.toString(nums) + " " + (p));


        return u;
    }

    public int removeDuplicates1(int[] nums) {
        int mark = 101;
        for (int i = 0; i < nums.length; ) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1] && nums[i] != mark) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = mark;
            } else i++;
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == mark) return i;
        }

        return nums.length;
    }

    public String longestCommonPrefix(String[] strs) {

        int index = 0;
        String first = strs[0];
        StringBuilder sb = new StringBuilder(first.length());

        for (char fc : first.toCharArray()) {
            for (String str : strs) {
                if (index < str.length()) {
                    char c = str.charAt(index);
                    if (c != fc) return sb.toString();
                } else return sb.toString();
            }
            sb.append(fc);
            index++;
        }

        return sb.toString();
    }

    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

}
