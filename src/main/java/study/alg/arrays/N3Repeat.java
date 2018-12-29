package study.alg.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class N3Repeat {

    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        //HashMap<Integer, Integer> map = new HashMap<>();

        int first = -1;
        int second = -1;
        int countFirst = 0;
        int countSecond = 0;
        for (int i = 0; i < a.size(); i++) {
            int v = a.get(i);
            if (first == v) {
                countFirst++;
            } else if (second == v) {
                countSecond++;
            } else if (countFirst == 0) {
                first = v;
                countFirst++;
            } else if (countSecond == 0) {
                second = v;
                countSecond++;
            } else {
                if (countFirst > 0) countFirst--;
                if (countSecond > 0) countSecond--;
            }

            //Integer freq = map.getOrDefault(v, 0);
            //map.put(v, freq.intValue()+1);
        }

        if (countFirst > 0 && occurence3(first, a)) {
            return first;
        } else if (countSecond > 0 && occurence3(second, a)) {
            return second;
        } else {
            return -1;
        }
    }

    boolean occurence3(int check, List<Integer> a) {
        int n = a.size();
        int n3 = n/3;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int v = a.get(i);
            if (v == check) count++;
        }
        return count > n3;
    }

    public static void main(String[] args) {
        N3Repeat alg = new N3Repeat();
        int res = alg.repeatedNumber(Arrays.asList(1000861, 1000963, 1000629, 1000629, 1000411, 1000629, 1000676, 1000789, 1000629, 1000629, 1000467, 1000101, 1000446, 1000534, 1000629, 1000846, 1000227, 1000629, 1000930, 1000480, 1000629, 1000115, 1000597, 1000848, 1000629));
        //int res = alg.repeatedNumber(Arrays.asList(1, 2, 3, 4, 5, 6));
        //int res = alg.repeatedNumber(Arrays.asList(1, 2, 3, 1, 1));
        //int res = alg.repeatedNumber(Arrays.asList(1000442, 1000206, 1000956, 1000143, 1000426, 1000592, 1000426, 1000136, 1000654, 1000426, 1000115, 1000121, 1000311, 1000451, 1000265, 1000426, 1000426, 1000254, 1000501, 1000715, 1000635, 1000602, 1000943, 1000119, 1000426, 1000426, 1000426, 1000378, 1000975, 1000292, 1000851, 1000426, 1000426, 1000181, 1000355, 1000426, 1000248, 1000143, 1000426, 1000985, 1000426, 1000634, 1000426, 1000945, 1000880, 1000426, 1000426, 1000135, 1000426, 1000402, 1000156, 1000426, 1000835, 1000599, 1000192, 1000451, 1000426, 1000241, 1000124, 1000100, 1000812, 1000611, 1000426, 1000641, 1000426, 1000426, 1000461, 1000872, 1000973, 1000426, 1000438, 1000517, 1000243, 1000658, 1000738, 1000396, 1000426, 1000426, 1000068, 1000427, 1000426, 1000504, 1000426, 1000462, 1000294, 1000504, 1000421, 1000883, 1000414, 1000426, 1000937, 1000426, 1000426, 1000819, 1000400, 1000323, 1000855, 1000779, 1000353, 1000426, 1000426, 1000506, 1000779, 1000487, 1000696, 1000729, 1000426, 1000025, 1000357, 1000946, 1000101, 1000459, 1000893, 1000426, 1000450, 1000491, 1000049, 1000420, 1000426, 1000103, 1000638, 1000315, 1000011, 1000426, 1000861, 1000111, 1000030, 1000477, 1000454, 1000309, 1000426, 1000756, 1000880, 1000213, 1000426, 1000206, 1000426, 1000436, 1000426, 1000026, 1000426, 1000756, 1000039, 1000426, 1000426, 1000426, 1000686, 1000426, 1000665, 1000426, 1000890, 1000992, 1000235, 1000701, 1000305, 1000482, 1000405, 1000426, 1000282, 1000191, 1000663, 1000199, 1000426, 1000119, 1000901, 1000998, 1000323, 1000426, 1000426, 1000844, 1000032, 1000737, 1000756, 1000426, 1000426, 1000275, 1000426, 1000635, 1000426, 1000426, 1000021, 1000426, 1000426, 1000322, 1000426, 1000501, 1000987, 1000995, 1000567, 1000795, 1000092, 1000758, 1000012, 1000426, 1000196, 1000641, 1000455, 1000426, 1000085, 1000933, 1000730, 1000426, 1000602, 1000549, 1000211, 1000025, 1000986, 1000349, 1000264, 1000426, 1000024, 1000426, 1000426, 1000680, 1000869, 1000320, 1000020, 1000194, 1000426, 1000426, 1000426, 1000716, 1000356, 1000748, 1000201, 1000426, 1000426, 1000002, 1000215, 1000850, 1000184, 1000803, 1000688, 1000561, 1000258, 1000426, 1000426, 1000612, 1000426, 1000246, 1000109, 1000156, 1000426, 1000355, 1000657, 1000929, 1000953, 1000159, 1000426, 1000919, 1000408, 1000778, 1000038, 1000046, 1000300, 1000272, 1000800, 1000426, 1000442, 1000551, 1000825, 1000501, 1000081, 1000426, 1000157, 1000203, 1000426, 1000022, 1000704, 1000426, 1000426, 1000034, 1000426, 1000163, 1000140, 1000426, 1000426, 1000704, 1000880, 1000707, 1000877, 1000214, 1000426, 1000426, 1000675, 1000312, 1000025, 1000426, 1000426, 1000792, 1000426, 1000326, 1000491, 1000633, 1000861, 1000426, 1000693, 1000426, 1000961, 1000647, 1000426, 1000426, 1000426, 1000426, 1000366, 1000871, 1000426, 1000904, 1000998, 1000114, 1000697, 1000426, 1000586, 1000426, 1000026, 1000994, 1000127, 1000205, 1000148, 1000280, 1000778, 1000380, 1000426, 1000122, 1000426, 1000426, 1000702, 1000426, 1000234, 1000426, 1000091, 1000426, 1000483, 1000712, 1000426, 1000425, 1000426, 1000692, 1000847, 1000331, 1000795, 1000328, 1000426, 1000677, 1000094, 1000426, 1000839, 1000890, 1000065, 1000641, 1000426, 1000426, 1000426, 1000463, 1000426, 1000445, 1000415, 1000243, 1000426, 1000426, 1000426, 1000029, 1000426, 1000426, 1000426, 1000572, 1000390, 1000931, 1000413, 1000606, 1000425, 1000426, 1000039, 1000657, 1000069, 1000998, 1000120, 1000426, 1000063, 1000015, 1000396, 1000426, 1000257, 1000397, 1000161, 1000426, 1000426, 1000493, 1000426, 1000501, 1000124, 1000426, 1000424, 1000902, 1000426, 1000426, 1000048, 1000426, 1000426, 1000394, 1000535, 1000426, 1000899, 1000654, 1000778, 1000120, 1000426, 1000426, 1000426, 1000568, 1000677, 1000426, 1000426, 1000723, 1000997, 1000426, 1000934, 1000881, 1000426, 1000687, 1000426, 1000487, 1000426, 1000426, 1000426, 1000131, 1000396, 1000107, 1000902, 1000426, 1000426, 1000525, 1000985, 1000426, 1000255, 1000991, 1000426, 1000426, 1000426, 1000020, 1000426, 1000426, 1000450, 1000455, 1000283, 1000426, 1000426, 1000426, 1000938, 1000426, 1000255, 1000426, 1000248, 1000099, 1000622, 1000426, 1000329, 1000005, 1000826, 1000060, 1000313, 1000426, 1000426, 1000426, 1000662, 1000426, 1000426, 1000426, 1000906, 1000482, 1000426, 1000349, 1000426, 1000968, 1000426, 1000426, 1000239, 1000426, 1000480, 1000357, 1000417, 1000311, 1000510, 1000085, 1000652, 1000426, 1000548, 1000426, 1000426, 1000426, 1000766, 1000751, 1000426, 1000685, 1000695, 1000455, 1000218, 1000426, 1000426, 1000426, 1000426, 1000696, 1000179, 1000506, 1000426, 1000408, 1000812, 1000871, 1000720, 1000144, 1000213, 1000083, 1000931, 1000128, 1000250, 1000426, 1000783, 1000426, 1000149, 1000376, 1000228, 1000426, 1000812, 1000000, 1000685, 1000525, 1000476, 1000826, 1000737, 1000426, 1000130, 1000561, 1000426, 1000281, 1000426, 1000866, 1000453, 1000240, 1000074, 1000426, 1000388, 1000426, 1000794, 1000426, 1000244, 1000426, 1000969, 1000817, 1000036, 1000426, 1000426, 1000490, 1000426, 1000795, 1000050, 1000808, 1000426, 1000426, 1000872, 1000426, 1000668, 1000426, 1000995, 1000140, 1000710, 1000983, 1000929, 1000434, 1000425, 1000019, 1000232, 1000892, 1000426, 1000561));
        //int res = alg.repeatedNumber(Arrays.asList(1000441, 1000441, 1000994));
        //int res = alg.repeatedNumber(Arrays.asList(1000545, 1000038, 1000647, 1000038, 1000562, 1000038, 1000586, 1000487, 1000951, 1000226, 1000038, 1000145, 1000038, 1000761, 1000196, 1000038, 1000821, 1000829, 1000038, 1000570, 1000846, 1000038, 1000178, 1001000, 1000038, 1000568, 1000278, 1000734, 1000048, 1000038, 1000002, 1000271, 1000388, 1000315, 1000816, 1000038, 1000038, 1000846, 1000305, 1000853, 1000383, 1000116, 1000797, 1000279, 1000038, 1000038, 1000049, 1000108, 1000789, 1000240, 1000201, 1000506, 1000429, 1000857, 1000649, 1000898, 1000211, 1000000, 1000178, 1000038, 1000569, 1000695, 1000451, 1000159, 1000038, 1000038, 1000038, 1000129, 1000038, 1000038, 1000904, 1000038, 1000038, 1000902, 1000525, 1000038, 1000166, 1000038, 1000765, 1000038, 1000561, 1000417, 1000523, 1000668, 1000296, 1000038, 1000038, 1000038, 1000461, 1000654, 1000924, 1000985, 1000038, 1000426, 1000038, 1000038, 1000038, 1000904, 1000775, 1000148, 1000961, 1000038, 1000038, 1000038, 1000833, 1000332, 1000038, 1000038, 1000512, 1000322, 1000592, 1000524, 1000788, 1000057, 1000497, 1000625, 1000599, 1000484, 1000038, 1000747, 1000457, 1000111, 1000038, 1000038, 1000493, 1000287, 1000007, 1000695, 1000344, 1000098, 1000038, 1000191, 1000038, 1000576, 1000481, 1000488, 1000199, 1000038, 1000663, 1000176, 1000038, 1000521, 1000721, 1000728, 1000247, 1000038, 1000038, 1000460, 1000644, 1000038, 1000497, 1000966, 1000431, 1000038, 1000975, 1000063, 1000580, 1000669, 1000038, 1000038, 1000492, 1000038, 1000038, 1000529, 1000553, 1000333, 1000038, 1000341, 1000569, 1000862, 1000017, 1000532, 1000571, 1000508, 1000402, 1000285, 1000611, 1000210, 1000646, 1000110, 1000038, 1000553, 1000273, 1000729, 1000038, 1000038, 1000720, 1000400, 1000038, 1000983, 1000038, 1000766, 1000038, 1000180, 1000494, 1000765, 1000136, 1000038, 1000029, 1000246, 1000991, 1000038, 1000759, 1000038, 1000038, 1000045, 1000038, 1000648, 1000038, 1000038, 1000694, 1000914, 1000990, 1000038, 1000038, 1000758, 1000435, 1000038, 1000554, 1000038, 1000452, 1000156, 1000038, 1000322, 1000828, 1000868, 1000038, 1000973, 1000991, 1000464, 1000294, 1000633, 1000038, 1000582, 1000229, 1000285, 1000038, 1000038, 1000086, 1000038, 1000989, 1000038, 1000038, 1000157, 1000307, 1000369, 1000300, 1000038, 1000038, 1000038, 1000244, 1000038, 1000038, 1000222, 1000458, 1000038, 1000523, 1000434, 1000316, 1000038, 1000256, 1000038, 1000695, 1000038, 1000469));
        System.out.println("res is " + res);
    }
}
