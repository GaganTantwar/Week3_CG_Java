package circularlinkedlist.roundrobinalgorithm;

public class RoundRobin {

        private Process head;
        private Process current;
        private int timeQuantum;

        RoundRobin(int timeQuantum) {
            this.head = null;
            this.current = null;
            this.timeQuantum = timeQuantum;
        }

        public void addProcess(int processID, int burstTime, int priority) {
            Process newProcess = new Process(processID, burstTime, priority);
            if (head == null) {
                head = newProcess;
                newProcess.next = head;
                current = head;
            } else {
                Process tail = getTail();
                tail.next = newProcess;
                newProcess.next = head;
            }
        }

        public void removeProcess(int processID) {
            if (head == null) {
                return;
            }
            if (head.processID == processID) {
                Process tail = getTail();
                head = head.next;
                tail.next = head;
                current = head;
                return;
            }
            Process current = head;
            while (current.next != head && current.next.processID != processID) {
                current = current.next;
            }
            if (current.next.processID == processID) {
                current.next = current.next.next;
            }
        }

        public void simulateScheduling() {
            if (head == null) {
                System.out.println("No processes available for scheduling.");
                return;
            }
            int currentTime = 0;
            boolean allProcessesCompleted;

            do {
                allProcessesCompleted = true;
                Process start = current;

                do {
                    if (current.burstTime > 0) {
                        allProcessesCompleted = false;
                        if (current.burstTime > timeQuantum) {
                            currentTime += timeQuantum;
                            current.burstTime -= timeQuantum;
                        } else {
                            currentTime += current.burstTime;
                            current.burstTime = 0;
                            removeProcess(current.processID);
                        }
                        displayProcesses();
                    }
                    current = current.next;
                } while (current != start);

            } while (!allProcessesCompleted);

            calculateAverageTimes(currentTime);
        }

        private void calculateAverageTimes(int totalTime) {
            int totalProcesses = getTotalProcesses();
            double avgWaitingTime = totalTime / (double) totalProcesses;
            double avgTurnAroundTime = (totalTime + totalTime) / (double) totalProcesses;

            System.out.println("Average Waiting Time: " + avgWaitingTime);
            System.out.println("Average Turn-around Time: " + avgTurnAroundTime);
        }

        private void displayProcesses() {
            if (head == null) {
                System.out.println("No processes available.");
                return;
            }
            Process current = head;
            do {
                System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
                current = current.next;
            } while (current != head);
            System.out.println();
        }

        private Process getTail() {
            if (head == null) {
                return null;
            }
            Process current = head;
            while (current.next != head) {
                current = current.next;
            }
            return current;
        }

        private int getTotalProcesses() {
            if (head == null) {
                return 0;
            }
            int count = 0;
            Process current = head;
            do {
                count++;
                current = current.next;
            } while (current != head);
            return count;
        }

}
