package top

import chisel3._
import chisel3.util._
import bus.axi4._
import device.AXI4RAM

class SoCTop extends Module {
    val Spec = Module(new SpecCore)
    val mem = Module(new AXI4RAM(new AXI4, 1024 * 1024 * 4, false, "./testcase/case1/test1.hex"))
    val memdelay = Module(new AXI4Delayer(0))
    memdelay.io.in <> Spec.io.mem
    mem.io.in <> memdelay.io.out
}