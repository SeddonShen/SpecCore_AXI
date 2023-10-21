package top

import chisel3._
import chisel3.util._
import bus.axi4._
import device.AXI4RAM

class SpecCore extends Module {
    val io = IO(new Bundle {
        val mem = new AXI4
    })
    // initialize the spec io.mem
    io.mem.aw.bits.user  := 0.U
    io.mem.aw.bits.burst := 0.U
    io.mem.aw.bits.cache := 0.U
    io.mem.w.bits.last   := 0.U
    io.mem.b.ready       := 0.U
    io.mem.aw.bits.size  := 0.U
    io.mem.ar.bits.prot  := 0.U
    io.mem.ar.bits.addr  := 0.U
    io.mem.ar.bits.burst := 0.U
    io.mem.aw.valid      := 0.U
    io.mem.aw.bits.prot  := 0.U
    io.mem.aw.bits.lock  := 0.U
    io.mem.ar.valid      := 0.U
    io.mem.r.ready       := 0.U
    io.mem.ar.bits.size  := 0.U
    io.mem.ar.bits.cache := 0.U
    io.mem.aw.bits.qos   := 0.U
    io.mem.aw.bits.len   := 0.U
    io.mem.w.bits.data   := 0.U
    io.mem.ar.bits.user  := 0.U
    io.mem.ar.bits.len   := 0.U
    io.mem.w.bits.strb   := 0.U
    io.mem.w.valid       := 0.U
    io.mem.ar.bits.qos   := 0.U
    io.mem.ar.bits.lock  := 0.U
    io.mem.aw.bits.addr  := 0.U
    io.mem.ar.bits.id    := 0.U
    io.mem.aw.bits.id    := 0.U
    // use axi4 protocol to connect with memory and access memory address ""h0000_0000".U" 
    // val mem = Module(new AXI4RAM(new AXI4, 1024 * 1024 * 4, true))
    // mem.io.in <> io.mem

    // and println the date in memory address ""h0000_0000".U"
    // printf("mem[0] = %d\n", mem.io.in.r.bits.data)
}