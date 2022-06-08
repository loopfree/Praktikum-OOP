import java.util.List;

public class Worker {
	public static int run(List<Integer> durations, int machineCount) {
		// implementation here
        int[] workerTask = new int[machineCount];
        int index = 0;
        int result = 0;

        if (machineCount==1)
        {
            while(index < durations.size()) {
                result += durations.get(index);
                index += 1;
        }
            return result;
        }

        while(index < durations.size()) {
            result += 1;
            for(int i = 0; i < machineCount; ++i) {
                workerTask[i] -= 1;
                if(workerTask[i] <= 0) {
                    workerTask[i] = durations.get(index);
                    index += 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < workerTask[i]; ++i) {
            if(workerTask[i] > max) {
                max = workerTask[i];
            }
        }
        result += max;
		return result - 1;
	}
}