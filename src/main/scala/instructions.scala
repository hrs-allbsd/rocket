package rocket

import Chisel._
import Node._

/* Automatically generated by parse-opcodes */
object Instructions {
  def BEQ                = Bits("b?????????????????000?????1100011")
  def BNE                = Bits("b?????????????????001?????1100011")
  def BLT                = Bits("b?????????????????100?????1100011")
  def BGE                = Bits("b?????????????????101?????1100011")
  def BLTU               = Bits("b?????????????????110?????1100011")
  def BGEU               = Bits("b?????????????????111?????1100011")
  def JALR               = Bits("b?????????????????000?????1100111")
  def JAL                = Bits("b?????????????????????????1101111")
  def LUI                = Bits("b?????????????????????????0110111")
  def AUIPC              = Bits("b?????????????????????????0010111")
  def ADDI               = Bits("b?????????????????000?????0010011")
  def SLLI               = Bits("b000000???????????001?????0010011")
  def SLTI               = Bits("b?????????????????010?????0010011")
  def SLTIU              = Bits("b?????????????????011?????0010011")
  def XORI               = Bits("b?????????????????100?????0010011")
  def SRLI               = Bits("b000000???????????101?????0010011")
  def SRAI               = Bits("b010000???????????101?????0010011")
  def ORI                = Bits("b?????????????????110?????0010011")
  def ANDI               = Bits("b?????????????????111?????0010011")
  def ADD                = Bits("b0000000??????????000?????0110011")
  def SUB                = Bits("b0100000??????????000?????0110011")
  def SLL                = Bits("b0000000??????????001?????0110011")
  def SLT                = Bits("b0000000??????????010?????0110011")
  def SLTU               = Bits("b0000000??????????011?????0110011")
  def XOR                = Bits("b0000000??????????100?????0110011")
  def SRL                = Bits("b0000000??????????101?????0110011")
  def SRA                = Bits("b0100000??????????101?????0110011")
  def OR                 = Bits("b0000000??????????110?????0110011")
  def AND                = Bits("b0000000??????????111?????0110011")
  def ADDIW              = Bits("b?????????????????000?????0011011")
  def SLLIW              = Bits("b0000000??????????001?????0011011")
  def SRLIW              = Bits("b0000000??????????101?????0011011")
  def SRAIW              = Bits("b0100000??????????101?????0011011")
  def ADDW               = Bits("b0000000??????????000?????0111011")
  def SUBW               = Bits("b0100000??????????000?????0111011")
  def SLLW               = Bits("b0000000??????????001?????0111011")
  def SRLW               = Bits("b0000000??????????101?????0111011")
  def SRAW               = Bits("b0100000??????????101?????0111011")
  def LB                 = Bits("b?????????????????000?????0000011")
  def LH                 = Bits("b?????????????????001?????0000011")
  def LW                 = Bits("b?????????????????010?????0000011")
  def LD                 = Bits("b?????????????????011?????0000011")
  def LBU                = Bits("b?????????????????100?????0000011")
  def LHU                = Bits("b?????????????????101?????0000011")
  def LWU                = Bits("b?????????????????110?????0000011")
  def SB                 = Bits("b?????????????????000?????0100011")
  def SH                 = Bits("b?????????????????001?????0100011")
  def SW                 = Bits("b?????????????????010?????0100011")
  def SD                 = Bits("b?????????????????011?????0100011")
  def FENCE              = Bits("b?????????????????000?????0001111")
  def FENCE_I            = Bits("b?????????????????001?????0001111")
  def MUL                = Bits("b0000001??????????000?????0110011")
  def MULH               = Bits("b0000001??????????001?????0110011")
  def MULHSU             = Bits("b0000001??????????010?????0110011")
  def MULHU              = Bits("b0000001??????????011?????0110011")
  def DIV                = Bits("b0000001??????????100?????0110011")
  def DIVU               = Bits("b0000001??????????101?????0110011")
  def REM                = Bits("b0000001??????????110?????0110011")
  def REMU               = Bits("b0000001??????????111?????0110011")
  def MULW               = Bits("b0000001??????????000?????0111011")
  def DIVW               = Bits("b0000001??????????100?????0111011")
  def DIVUW              = Bits("b0000001??????????101?????0111011")
  def REMW               = Bits("b0000001??????????110?????0111011")
  def REMUW              = Bits("b0000001??????????111?????0111011")
  def AMOADD_W           = Bits("b00000????????????010?????0101111")
  def AMOXOR_W           = Bits("b00100????????????010?????0101111")
  def AMOOR_W            = Bits("b01000????????????010?????0101111")
  def AMOAND_W           = Bits("b01100????????????010?????0101111")
  def AMOMIN_W           = Bits("b10000????????????010?????0101111")
  def AMOMAX_W           = Bits("b10100????????????010?????0101111")
  def AMOMINU_W          = Bits("b11000????????????010?????0101111")
  def AMOMAXU_W          = Bits("b11100????????????010?????0101111")
  def AMOSWAP_W          = Bits("b00001????????????010?????0101111")
  def LR_W               = Bits("b00010??00000?????010?????0101111")
  def SC_W               = Bits("b00011????????????010?????0101111")
  def AMOADD_D           = Bits("b00000????????????011?????0101111")
  def AMOXOR_D           = Bits("b00100????????????011?????0101111")
  def AMOOR_D            = Bits("b01000????????????011?????0101111")
  def AMOAND_D           = Bits("b01100????????????011?????0101111")
  def AMOMIN_D           = Bits("b10000????????????011?????0101111")
  def AMOMAX_D           = Bits("b10100????????????011?????0101111")
  def AMOMINU_D          = Bits("b11000????????????011?????0101111")
  def AMOMAXU_D          = Bits("b11100????????????011?????0101111")
  def AMOSWAP_D          = Bits("b00001????????????011?????0101111")
  def LR_D               = Bits("b00010??00000?????011?????0101111")
  def SC_D               = Bits("b00011????????????011?????0101111")
  def SCALL              = Bits("b00000000000000000000000001110011")
  def SBREAK             = Bits("b00000000000100000000000001110011")
  def SRET               = Bits("b10000000000000000000000001110011")
  def CSRRW              = Bits("b?????????????????001?????1110011")
  def CSRRS              = Bits("b?????????????????010?????1110011")
  def CSRRC              = Bits("b?????????????????011?????1110011")
  def CSRRWI             = Bits("b?????????????????101?????1110011")
  def CSRRSI             = Bits("b?????????????????110?????1110011")
  def CSRRCI             = Bits("b?????????????????111?????1110011")
  def FADD_S             = Bits("b0000000??????????????????1010011")
  def FSUB_S             = Bits("b0000100??????????????????1010011")
  def FMUL_S             = Bits("b0001000??????????????????1010011")
  def FDIV_S             = Bits("b0001100??????????????????1010011")
  def FSGNJ_S            = Bits("b0010000??????????000?????1010011")
  def FSGNJN_S           = Bits("b0010000??????????001?????1010011")
  def FSGNJX_S           = Bits("b0010000??????????010?????1010011")
  def FMIN_S             = Bits("b0010100??????????000?????1010011")
  def FMAX_S             = Bits("b0010100??????????001?????1010011")
  def FSQRT_S            = Bits("b010110000000?????????????1010011")
  def FADD_D             = Bits("b0000001??????????????????1010011")
  def FSUB_D             = Bits("b0000101??????????????????1010011")
  def FMUL_D             = Bits("b0001001??????????????????1010011")
  def FDIV_D             = Bits("b0001101??????????????????1010011")
  def FSGNJ_D            = Bits("b0010001??????????000?????1010011")
  def FSGNJN_D           = Bits("b0010001??????????001?????1010011")
  def FSGNJX_D           = Bits("b0010001??????????010?????1010011")
  def FMIN_D             = Bits("b0010101??????????000?????1010011")
  def FMAX_D             = Bits("b0010101??????????001?????1010011")
  def FCVT_S_D           = Bits("b010000000001?????????????1010011")
  def FCVT_D_S           = Bits("b010000100000?????????????1010011")
  def FSQRT_D            = Bits("b010110100000?????????????1010011")
  def FLE_S              = Bits("b1010000??????????000?????1010011")
  def FLT_S              = Bits("b1010000??????????001?????1010011")
  def FEQ_S              = Bits("b1010000??????????010?????1010011")
  def FLE_D              = Bits("b1010001??????????000?????1010011")
  def FLT_D              = Bits("b1010001??????????001?????1010011")
  def FEQ_D              = Bits("b1010001??????????010?????1010011")
  def FCVT_W_S           = Bits("b110000000000?????????????1010011")
  def FCVT_WU_S          = Bits("b110000000001?????????????1010011")
  def FCVT_L_S           = Bits("b110000000010?????????????1010011")
  def FCVT_LU_S          = Bits("b110000000011?????????????1010011")
  def FMV_X_S            = Bits("b111000000000?????000?????1010011")
  def FCLASS_S           = Bits("b111000000000?????001?????1010011")
  def FCVT_W_D           = Bits("b110000100000?????????????1010011")
  def FCVT_WU_D          = Bits("b110000100001?????????????1010011")
  def FCVT_L_D           = Bits("b110000100010?????????????1010011")
  def FCVT_LU_D          = Bits("b110000100011?????????????1010011")
  def FMV_X_D            = Bits("b111000100000?????000?????1010011")
  def FCLASS_D           = Bits("b111000100000?????001?????1010011")
  def FCVT_S_W           = Bits("b110100000000?????????????1010011")
  def FCVT_S_WU          = Bits("b110100000001?????????????1010011")
  def FCVT_S_L           = Bits("b110100000010?????????????1010011")
  def FCVT_S_LU          = Bits("b110100000011?????????????1010011")
  def FMV_S_X            = Bits("b111100000000?????000?????1010011")
  def FCVT_D_W           = Bits("b110100100000?????????????1010011")
  def FCVT_D_WU          = Bits("b110100100001?????????????1010011")
  def FCVT_D_L           = Bits("b110100100010?????????????1010011")
  def FCVT_D_LU          = Bits("b110100100011?????????????1010011")
  def FMV_D_X            = Bits("b111100100000?????000?????1010011")
  def FLW                = Bits("b?????????????????010?????0000111")
  def FLD                = Bits("b?????????????????011?????0000111")
  def FSW                = Bits("b?????????????????010?????0100111")
  def FSD                = Bits("b?????????????????011?????0100111")
  def FMADD_S            = Bits("b?????00??????????????????1000011")
  def FMSUB_S            = Bits("b?????00??????????????????1000111")
  def FNMSUB_S           = Bits("b?????00??????????????????1001011")
  def FNMADD_S           = Bits("b?????00??????????????????1001111")
  def FMADD_D            = Bits("b?????01??????????????????1000011")
  def FMSUB_D            = Bits("b?????01??????????????????1000111")
  def FNMSUB_D           = Bits("b?????01??????????????????1001011")
  def FNMADD_D           = Bits("b?????01??????????????????1001111")
  def CUSTOM0            = Bits("b?????????????????000?????0001011")
  def CUSTOM0_RS1        = Bits("b?????????????????010?????0001011")
  def CUSTOM0_RS1_RS2    = Bits("b?????????????????011?????0001011")
  def CUSTOM0_RD         = Bits("b?????????????????100?????0001011")
  def CUSTOM0_RD_RS1     = Bits("b?????????????????110?????0001011")
  def CUSTOM0_RD_RS1_RS2 = Bits("b?????????????????111?????0001011")
  def CUSTOM1            = Bits("b?????????????????000?????0101011")
  def CUSTOM1_RS1        = Bits("b?????????????????010?????0101011")
  def CUSTOM1_RS1_RS2    = Bits("b?????????????????011?????0101011")
  def CUSTOM1_RD         = Bits("b?????????????????100?????0101011")
  def CUSTOM1_RD_RS1     = Bits("b?????????????????110?????0101011")
  def CUSTOM1_RD_RS1_RS2 = Bits("b?????????????????111?????0101011")
  def CUSTOM2            = Bits("b?????????????????000?????1011011")
  def CUSTOM2_RS1        = Bits("b?????????????????010?????1011011")
  def CUSTOM2_RS1_RS2    = Bits("b?????????????????011?????1011011")
  def CUSTOM2_RD         = Bits("b?????????????????100?????1011011")
  def CUSTOM2_RD_RS1     = Bits("b?????????????????110?????1011011")
  def CUSTOM2_RD_RS1_RS2 = Bits("b?????????????????111?????1011011")
  def CUSTOM3            = Bits("b?????????????????000?????1111011")
  def CUSTOM3_RS1        = Bits("b?????????????????010?????1111011")
  def CUSTOM3_RS1_RS2    = Bits("b?????????????????011?????1111011")
  def CUSTOM3_RD         = Bits("b?????????????????100?????1111011")
  def CUSTOM3_RD_RS1     = Bits("b?????????????????110?????1111011")
  def CUSTOM3_RD_RS1_RS2 = Bits("b?????????????????111?????1111011")
}
object Causes {
  val misaligned_fetch = 0x0
  val fault_fetch = 0x1
  val illegal_instruction = 0x2
  val privileged_instruction = 0x3
  val fp_disabled = 0x4
  val syscall = 0x6
  val breakpoint = 0x7
  val misaligned_load = 0x8
  val misaligned_store = 0x9
  val fault_load = 0xa
  val fault_store = 0xb
  val accelerator_disabled = 0xc
  val all = {
    val res = collection.mutable.ArrayBuffer[Int]()
    res += misaligned_fetch
    res += fault_fetch
    res += illegal_instruction
    res += privileged_instruction
    res += fp_disabled
    res += syscall
    res += breakpoint
    res += misaligned_load
    res += misaligned_store
    res += fault_load
    res += fault_store
    res += accelerator_disabled
    res.toArray
  }
}
object CSRs {
  val fflags = 0x1
  val frm = 0x2
  val fcsr = 0x3
  val stats = 0xc0
  val sup0 = 0x500
  val sup1 = 0x501
  val epc = 0x502
  val badvaddr = 0x503
  val ptbr = 0x504
  val asid = 0x505
  val count = 0x506
  val compare = 0x507
  val evec = 0x508
  val cause = 0x509
  val status = 0x50a
  val hartid = 0x50b
  val impl = 0x50c
  val fatc = 0x50d
  val send_ipi = 0x50e
  val clear_ipi = 0x50f
  val reset = 0x51d
  val tohost = 0x51e
  val fromhost = 0x51f
  val cycle = 0xc00
  val time = 0xc01
  val instret = 0xc02
  val uarch0 = 0xcc0
  val uarch1 = 0xcc1
  val uarch2 = 0xcc2
  val uarch3 = 0xcc3
  val uarch4 = 0xcc4
  val uarch5 = 0xcc5
  val uarch6 = 0xcc6
  val uarch7 = 0xcc7
  val uarch8 = 0xcc8
  val uarch9 = 0xcc9
  val uarch10 = 0xcca
  val uarch11 = 0xccb
  val uarch12 = 0xccc
  val uarch13 = 0xccd
  val uarch14 = 0xcce
  val uarch15 = 0xccf
  val counth = 0x586
  val cycleh = 0xc80
  val timeh = 0xc81
  val instreth = 0xc82
  val all = {
    val res = collection.mutable.ArrayBuffer[Int]()
    res += fflags
    res += frm
    res += fcsr
    res += stats
    res += sup0
    res += sup1
    res += epc
    res += badvaddr
    res += ptbr
    res += asid
    res += count
    res += compare
    res += evec
    res += cause
    res += status
    res += hartid
    res += impl
    res += fatc
    res += send_ipi
    res += clear_ipi
    res += reset
    res += tohost
    res += fromhost
    res += cycle
    res += time
    res += instret
    res += uarch0
    res += uarch1
    res += uarch2
    res += uarch3
    res += uarch4
    res += uarch5
    res += uarch6
    res += uarch7
    res += uarch8
    res += uarch9
    res += uarch10
    res += uarch11
    res += uarch12
    res += uarch13
    res += uarch14
    res += uarch15
    res.toArray
  }
  val all32 = {
    val res = collection.mutable.ArrayBuffer(all:_*)
    res += counth
    res += cycleh
    res += timeh
    res += instreth
    res.toArray
  }
}
