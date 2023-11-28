public class instructions {
    
    public static class And{

        public String opcode;
        public String rd;
        public String rs;
        public String rt;
        public String funct;
        public String shampt;

        public And(String rd, String rs, String rt) {
            this.opcode = "000000";
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
            this.funct = "100100";
            this.shampt = "00000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.rd + " ");
            System.out.print(this.shampt + " ");
            System.out.print(this.funct);
        }
    }

    public static class Or {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;
        public String funct;
        public String shampt;

        public Or(String rd, String rs, String rt) {
            this.opcode = "000000";
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
            this.funct = "100101";
            this.shampt = "00000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.rd + " ");
            System.out.print(this.shampt + " ");
            System.out.print(this.funct);
        }
    }

    public static class Add {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;
        public String funct;
        public String shampt;

        public Add(String rd, String rs, String rt) {
            this.opcode = "000000";
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
            this.funct = "100000";
            this.shampt = "00000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.rd + " ");
            System.out.print(this.shampt + " ");
            System.out.print(this.funct);
        }
    }

    public static class Sll {

        public String opcode;
        public String rd;
        public String rt;
        public String sa;
        public String rs;
        public String funct;

        public Sll(String rd, String rt, String sa) {
            this.opcode = "000000";
            this.rd = rd;
            this.rt = rt;
            this.sa = sa;
            this.rs = "00000";
            this.funct = "000000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.rd + " ");
            System.out.print(this.sa + " ");
            System.out.print(this.funct);
        }
    }

    public static class Sub {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;
        public String funct;
        public String shampt;

        public Sub(String rd, String rs, String rt) {
            this.opcode = "000000";
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
            this.funct = "100010";
            this.shampt = "00000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.rd + " ");
            System.out.print(this.shampt + " ");
            System.out.print(this.funct);
        }
    }

    public static class Slt {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;
        public String funct;
        public String shampt;

        public Slt(String rd, String rs, String rt) {
            this.opcode = "000000";
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
            this.funct = "101010";
            this.shampt = "00000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.rd + " ");
            System.out.print(this.shampt + " ");
            System.out.print(this.funct);
        }
    }

    public static class Jr {

        public String opcode;
        public String rs;
        public String shampt;
        public String funct;

        public Jr(String rs) {
            this.opcode = "000000";
            this.rs = rs;
            this.shampt = "000000000000000";
            this.funct = "001000";
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.shampt + " ");
            System.out.print(this.funct);
            }
    }
    
    public static class Addi {
        public String opcode;
        public String rs;
        public String rt;
        public String imm;
        
        public Addi(String rs, String rt, String imm) {
            this.opcode = "001000";
            this.rs = rs;
            this.rt = rt;
            this.imm = imm;
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.imm);
        }
    }

    public static class Beq {
        public String opcode;
        public String rs;
        public String rt;
        public String offset;
        
        public Beq(String rs, String rt, String offset) {
            this.opcode = "000100";
            this.rs = rs;
            this.rt = rt;
            this.offset = offset;
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.offset);
        }
    }

    public static class Bne {
        public String opcode;
        public String rs;
        public String rt;
        public String offset;
        
        public Bne(String rs, String rt, String offset) {
            this.opcode = "000101";
            this.rs = rs;
            this.rt = rt;
            this.offset = offset;
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.offset);
        }
    }

    public static class Lw {
        public String opcode;
        public String rs;
        public String rt;
        public String offset;
        
        public Lw(String rt, String offset, String rs) {
            this.opcode = "100011";
            this.rs = rs;
            this.rt = rt;
            this.offset = offset;
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.offset);
        }
    }
    
    public static class Sw {
        public String opcode;
        public String rs;
        public String rt;
        public String offset;
        
        public Sw(String rt, String offset, String rs) {
            this.opcode = "101011";
            this.rs = rs;
            this.rt = rt;
            this.offset = offset;
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.rs + " ");
            System.out.print(this.rt + " ");
            System.out.print(this.offset);
        }
    }

    public static class J {
        public String opcode;
        public String target;
        
        public J(String target) {
            this.opcode = "000010";
            this.target = target;
        }

        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.target);
        }
    }

    public static class Jal {
        public String opcode;
        public String target;
        
        public Jal(String target) {
            this.opcode = "000011";
            this.target = target;
        }
        public void printObj() {
            System.out.print(this.opcode + " ");
            System.out.print(this.target);
        }
    }
}