package top

import chisel3._
import chisel3.util._
import bus.axi4._
import device.AXI4RAM

class SpecCore extends Module {
    val io = IO(new Bundle {
        val mem = new AXI4
    })
    // use axi4 protocol to connect with memory and access memory address ""h0000_0000".U" 
    // val mem = Module(new AXI4RAM(new AXI4, 1024 * 1024 * 4, true))
    // mem.io.in <> io.mem

    // and println the date in memory address ""h0000_0000".U"
    // printf("mem[0] = %d\n", mem.io.in.r.bits.data)
}