import java.util.Scanner;          
import java.io.File;             
import java.text.NumberFormat;    

public class FileSizeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance();
        
        System.out.println("File Size Analyzer");
        System.out.println("------------------");
        
        System.out.print("Enter file or directory path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        if (!file.exists()) {
            System.out.println("Error: File or directory does not exist!");
            scanner.close();
            return;
        }
        
        analyzeFile(file, nf);
        
        scanner.close();
    }
    
    private static void analyzeFile(File file, NumberFormat nf) {
        if (file.isFile()) {
            System.out.println("\nFile: " + file.getName());
            System.out.println("Size: " + formatSize(file.length()));
            System.out.println("Last Modified: " + new java.util.Date(file.lastModified()));
        } else if (file.isDirectory()) {
            System.out.println("\nDirectory: " + file.getName());
            
            File[] files = file.listFiles();
            if (files == null || files.length == 0) {
                System.out.println("Directory is empty");
                return;
            }
            
            long totalSize = 0;
            int fileCount = 0;
            int dirCount = 0;
            
            for (File f : files) {
                if (f.isFile()) {
                    totalSize += f.length();
                    fileCount++;
                } else if (f.isDirectory()) {
                    dirCount++;
                }
            }
            
            System.out.println("Contains: " + nf.format(fileCount) + " files and " + 
                             nf.format(dirCount) + " subdirectories");
            System.out.println("Total Size: " + formatSize(totalSize));
            
            // Show largest and smallest files
            if (fileCount > 0) {
                File largest = null;
                File smallest = null;
                long maxSize = Long.MIN_VALUE;
                long minSize = Long.MAX_VALUE;
                
                for (File f : files) {
                    if (f.isFile()) {
                        long size = f.length();
                        if (size > maxSize) {
                            maxSize = size;
                            largest = f;
                        }
                        if (size < minSize) {
                            minSize = size;
                            smallest = f;
                        }
                    }
                }
                
                System.out.println("\nLargest File: " + largest.getName() + 
                                  " (" + formatSize(largest.length()) + ")");
                System.out.println("Smallest File: " + smallest.getName() + 
                                  " (" + formatSize(smallest.length()) + ")");
            }
        }
    }
    
    private static String formatSize(long size) {
        if (size < 1024) {
            return size + " B";
        } else if (size < 1024 * 1024) {
            return String.format("%.2f KB", size / 1024.0);
        } else if (size < 1024 * 1024 * 1024) {
            return String.format("%.2f MB", size / (1024.0 * 1024.0));
        } else {
            return String.format("%.2f GB", size / (1024.0 * 1024.0 * 1024.0));
        }
    }
}