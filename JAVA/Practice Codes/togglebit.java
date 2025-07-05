

public class togglebit {
    
        public static int toggleBits(int num) {
            int bitmask = 0b00011010101000; 
    
            return num ^ bitmask;
        }
    
        public static void main(String[] args) {
            int num = 18; 
            
            System.out.println("Original number: " + Integer.toBinaryString(num));
            
            int result = toggleBits(num);
            
            System.out.println("After toggling bits at positions 2, 4, 5, 7, and 8: " + Integer.toBinaryString(result));
        }
    }
    

