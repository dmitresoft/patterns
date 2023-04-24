package com.sukhovilin.interview;

import java.security.CryptoPrimitive;
import java.security.PublicKey;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class App4 {

    static class RecentCounter {

        TreeSet<Integer> time;

        public RecentCounter() {
            time = new TreeSet<>();
        }

        public int ping(int t) {
            time.add(t);
            return time.tailSet(t-3000).size();
        }


    }

    public static void main(String[] args) {

        var c = new RecentCounter();

        System.out.println(c.ping(1));
        System.out.println(c.ping(100));
        System.out.println(c.ping(3001));
        System.out.println(c.ping(3002));


        //var a = new App4().reverse(123);
        //twoSum(new int[]{2, 7, 11, 15}, 9);
        //System.out.println("solution=" + a);

    }

    public int reverse(int x) {
        x = 123;
        System.out.println(x);
        System.out.println(
                Integer.reverseBytes(x)
        );

        Stack<Integer> stack = new Stack<>();
        boolean sign = x < 0;
        if (sign) x = -x;

        int count = 0;
        long s = 1;
        int t = x;

        while (x >= s) {
            s *= 10;
            count++;
            int n = t % 10;
            stack.push(n);
            t /= 10;
        }
        System.out.println(stack);
        return -1;
    }

    public int reverse1(int x) {

        x = 1563847412;

        //1056389759


        boolean sign = x < 0;
        if (sign) x = -x;

        int count = 0;
        long s = 1;
        while (x >= s) {
            s *= 10;
            count++;
        }

        int a = 0, t = x, m = (int) Math.pow(10d, count - 1);

        for (int i = 0; i < count; i++) {
            int n = t % 10;
            a += n * m;
            if (a < 0 || (long) n * (long) m > Integer.MAX_VALUE) return 0;
            t /= 10;
            m /= 10;
        }

        return sign ? -a : a;
    }

    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = "a, a, a, a, b,b,b,c, c";
        banned = new String[]{"a"};

        Set<String> b = new HashSet<>(Arrays.asList(banned));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (!Character.isLetter(c)) {
                sb.append(" ");
            } else {
                sb.append(c);
            }
        }
        paragraph = sb.toString();

        while (!paragraph.equals(paragraph = paragraph.replace("  ", " "))) {
        }

        paragraph = paragraph.toLowerCase();

        Map<String, Integer> map = new HashMap<>();
        String ans = "";
        int max = 0;

        String[] words = paragraph.split(" ");
        for (String word : words) {
            if (!b.contains(word)) {
                var a = map.compute(word, (k, v) -> v == null ? 1 : ++v);
                if (a > max) {
                    max = a;
                    ans = word;
                }
            }
        }

        return ans;
    }

    public int numUniqueEmails(String[] emails) {

        emails = new String[]{"fg.r.u.uzj+o.pw@kziczvh.com", "r.cyo.g+d.h+b.ja@tgsg.z.com", "fg.r.u.uzj+o.f.d@kziczvh.com", "r.cyo.g+ng.r.iq@tgsg.z.com", "fg.r.u.uzj+lp.k@kziczvh.com", "r.cyo.g+n.h.e+n.g@tgsg.z.com", "fg.r.u.uzj+k+p.j@kziczvh.com", "fg.r.u.uzj+w.y+b@kziczvh.com", "r.cyo.g+x+d.c+f.t@tgsg.z.com", "r.cyo.g+x+t.y.l.i@tgsg.z.com", "r.cyo.g+brxxi@tgsg.z.com", "r.cyo.g+z+dr.k.u@tgsg.z.com", "r.cyo.g+d+l.c.n+g@tgsg.z.com", "fg.r.u.uzj+vq.o@kziczvh.com", "fg.r.u.uzj+uzq@kziczvh.com", "fg.r.u.uzj+mvz@kziczvh.com", "fg.r.u.uzj+taj@kziczvh.com", "fg.r.u.uzj+fek@kziczvh.com"};

        Set<String> set = new HashSet<>();

        for (String email : emails) {
            int pos = email.indexOf("@");
            String name = email.substring(0, pos);
            int index = name.indexOf("+");
            if (index > 0) name = name.substring(0, index);
            name = name.replace(".", "");
            set.add(name + email.substring(pos));
        }


        System.out.println(set);

        return set.size();
    }

    private String filter(String email) {
        String[] parts = email.split("@");
        parts[0] = parts[0].replace(".", "");
        int index = parts[0].indexOf("+");
        if (index > 0) parts[0] = parts[0].substring(0, index);

        return parts[0] + "@" + parts[1];
    }


    public int removeElement(int[] nums, int val) {


        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;


        return 1;
    }

    public int removeElement1(int[] nums, int val) {


        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;

        int lo = 0, hi = nums.length - 1;

        while (lo < nums.length) {

            if (nums[lo] == val) {
                nums[lo] = nums[hi];
                nums[hi] = -1;
                hi--;
            } else {
                lo++;
            }
        }

        Arrays.sort(nums);
        //System.out.println(hi+1);
        return hi + 1;
        //nums.length - pos;
    }

    public long reverseBits(int n) { //3221225471

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1 << i) == 1 << i) {
                ans |= 1 << (31 - i);
            }
        }
        return Integer.reverse(n);
    }

    private void showBits(int ans) {
        for (int i = 31; i >= 0; i--) {
            boolean b = (ans & 1L << i) == 1L << i;
            System.out.print(b ? "1" : "0");
        }
        System.out.println();
    }


    public boolean equalFrequency(String word) { // true

        Map<Integer, String> map = new HashMap<>();

        int s = -21;// 1 | 0x40000000;

        //System.out.println("s "+s);
        System.out.println("-->" + ((s & 0x40000000) == 0x40000000));

        int[] a = new int[26];
        for (int i = 0; i < word.length(); i++) {
            a[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[i]--;
                if (isAnswer(a)) return true;
                a[i]++;
            }
        }
        return false;
    }

    private boolean isAnswer(int[] a) {
        int f = -1;
        for (int c : a) {
            if (c > 0) {
                if (f == -1) {
                    f = c;
                    continue;
                }
                if (f != c) return false;
            }
        }
        return true;
    }

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public int[] getConcatenation1(int[] nums) {
        int[] ans = new int[nums.length * 2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }

    public double[] convertTemperature(double celsius) {
//        Kelvin = Celsius + 273.15
        //      Fahrenheit = Celsius * 1.80 + 32.00

        double f = celsius * 1.8 + 32.00;
        double k = celsius + 273.15;
        return new double[]{k, f};

    }

    public int numIdenticalPairs(int[] nums) {

        int[] counters = new int[100];
        for (int num : nums) {
            counters[num]++;
        }

        int accum = 0;
        for (int counter : counters) {
            accum += counter * (counter - 1) / 2;
        }
        return accum;

    }

    public int numIdenticalPairs1(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.compute(j, (k, v) -> v == null ? 1 : ++v);
        }

        int accum = 0;
        for (var entry : map.values()) {
            accum += entry * (entry - 1) / 2;
        }
        return accum;

//        int c = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) c++;
//            }
//        }
//        return c;
    }

    public int[] buildArray(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            nums[i] |= nums[nums[i] & 0xFFF] << 16;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] >> 16;
        }


//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = nums[i] << 16;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] |= nums[nums[i] >> 16] >> 16;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] &= 0xFFFF;
//        }

        return nums;

    }

    public int searchInsert(int[] nums, int target) {

        nums = new int[]{1, 3, 5, 6};
        target = 2;


        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int middle = (low + high) >>> 1;

            if (target == nums[middle])
                return middle;

            if (target > nums[middle])
                low = middle + 1;
            else
                high = middle - 1;

        }

        System.out.println(low);

        return nums.length;
    }


    public boolean isPalindrome(int x) {

        x = 1410110141;

        int c = x;
        int y = 0;
        long m = 1;

        do {
            y *= 10;
            y += c % 10;
            c /= 10;
        } while (x >= (m *= 10));


        System.out.println("x= " + x);
        System.out.println("y= " + y);
        return x == y;


    }

    private int find(int num, int c) {
        c = 3;
        for (int i = 0; i < c; i++) {

            System.out.println(
                    "->" + num % 10
            );
            num /= 10;

        }

        return num % 100;
    }

    public int[] twoSum(int[] nums, int target) {


        nums = new int[]{2, 5, 5, 11};
        target = 10;

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = target - nums[i];
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;


//        for (int i = 0; i < nums.length; i++) {
//            Integer index = map.get(target - nums[i]);
//            if (index != null && i != index) return new int[]{i, index};
//        }
//
//        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {

        nums = new int[]{3, 4, 2};
        target = 6;

        int f = 0, l = nums.length - 1;


        while (f < l) {

            int sum = nums[f] + nums[l];
            if (sum == target) return new int[]{f, l};

            System.out.println(f + " " + l + " -> " + sum);

            if (nums[l] > target) {
                l--;
            } else f++;
            if (nums[f] > target) {
                f++;
            } else l--;


        }

        return nums;
    }


    private int uniq(String s) {

        s = "aabb";

        //char[] chars = s.toCharArray();
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (counter[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;

    }

    private boolean shop1(String note, String magazine) {
        List<Character> list = new ArrayList<>(magazine.length() * 2);
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }

        for (int i = 0; i < note.length(); i++) {
            boolean a = list.remove((Character) note.charAt(i));
            if (a == false) return false;
        }
        return true;
    }

    private boolean shop(String note, String magazine) {
        byte[] shop = new byte[26];
        for (int i = 0; i < magazine.length(); i++) shop[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < note.length(); i++) if (--shop[note.charAt(i) - 'a'] < 0) return false;
        return true;
    }

    private boolean shop5(String note, String magazine) {
        byte[] shop = new byte[26];
        for (char c : magazine.toCharArray()) shop[c - 'a']++;
        for (char c : note.toCharArray()) if (--shop[c - 'a'] < 0) return false;
        return true;
    }

    private boolean shop3(String note, String magazine) {

        byte[] _magazine = magazine.getBytes();
        Arrays.sort(_magazine);
        byte[] _note = note.getBytes();
        Arrays.sort(_note);

        int j = 0;

        for (int i = 0; i < _note.length; i++) {
            boolean f = false;
            for (; j < _magazine.length; j++) {
                if (_note[i] == _magazine[j]) {
                    f = true;
                    //j++;
                    break;
                } else {
                    //j++;
                }
            }
            if (!f) return false;
        }

        return true;
    }

    private boolean shop2(String note, String magazine) {

        byte[] _magazine = magazine.getBytes();
        byte[] _note = note.getBytes();

        for (int j = 0; j < _note.length; j++) {
            boolean found = false;
            for (int i = 0; i < _magazine.length; i++) {
                if (_note[j] == _magazine[i]) {
                    //System.out.println("found " + (char) _magazine[i] + " pos " + i);
                    _magazine[i] = 0;
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }


        return true;

    }

    private void bulls(String secret, String guess) {

        secret = "1123";
        guess = "0111"; // 1A1B
        // secret = "11";
        // guess = "10"; // 1A0B
        //secret = "1122";
        //guess = "0001"; // 0A1B

        //Set<Character> set = new HashSet<>();

        int b = 0, c = 0;
        BitSet sset = new BitSet();
        BitSet gset = new BitSet();

        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                b++;
                sset.set(i);
                gset.set(i);
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            for (int j = 0; j < guess.length(); j++) {
                if (!sset.get(i) && !sset.get(j))
                    if (secret.charAt(i) == guess.charAt(j)) {
                        c++;
                        System.out.println(i + " " + j);
                        sset.set(j);
                        break;
                    }
            }
        }

        String r = b + "A" + c + "B";
        System.out.println(r);


        //1A3B
    }


    private void go(int[] nums) {

        nums = new int[]{10, 9, 9, 9, 10};

        int maj = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                maj = num;
                count = 1;
            } else {
                if (maj == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }


//        if (count == 0) ans = num;
//        count += num == ans ? 1 : -1;

        System.out.println(count + " " + maj);

//
//        int max =0;
//        int ans =0;
//        for (var e : map.entrySet()) {
//            if (max< e.getValue() ){
//                max=e.getValue();
//                ans = e.getKey();
//            }
//        }
//        System.out.println(map);
//        System.out.println(ans);

    }

    private void go1(int[] height) {

        //height = new int[]{0,2};
        height = new int[]{1, 1};
        height = new int[]{2, 3, 10, 5, 7, 8, 9};
        //


        int answer = 0;

        int f = 0;
        int l = height.length - 1;

        boolean flag = true;

        while (f <= l) {
            int v = Math.min(height[f], height[l]) * (l - f);
            if (v > answer) answer = v;
            if (flag) {
                f++;
            } else {
                l--;
            }
            flag = !flag;


            System.out.println(f + " " + l);
        }

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 2; j > i; j--) {
                int v = Math.min(height[i], height[j]) * (j - i);
                if (v > answer) answer = v;
            }
        }

        System.out.println("answer " + answer);

    }

    private int check(String master, String w) {
        int n = 0;
        for (int i = 0; i < master.length(); i++) {
            if (master.charAt(i) == w.charAt(i)) n++;
        }
        return n;
    }
}
