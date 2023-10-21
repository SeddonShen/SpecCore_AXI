// See README.md for license details.

package top

import chisel3._
import chiseltest._
import org.scalatest.freespec.AnyFreeSpec
import chisel3.experimental.BundleLiterals._


class SocTopSpec extends AnyFreeSpec with ChiselScalatestTester {
  // test SocTop
  "SocTop should pass" in {
    test(new SoCTop()) { dut =>
      dut.clock.step(20)
    }
  }
}
