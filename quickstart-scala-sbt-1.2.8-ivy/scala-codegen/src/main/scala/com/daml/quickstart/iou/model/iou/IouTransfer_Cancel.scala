/*
 * THIS FILE WAS AUTOGENERATED BY THE DIGITAL ASSET DAML SCALA CODE GENERATOR
 * DO NOT EDIT BY HAND!
 */
import _root_.com.daml.ledger.client.{binding=>$u0020lfdomainapi}
import _root_.com.daml.ledger.api.v1.{value=>$u0020rpcvalue}
package com.daml.quickstart.iou.model {
  package Iou {
    final case class IouTransfer_Cancel() extends ` lfdomainapi`.ValueRef

    object IouTransfer_Cancel extends ` lfdomainapi`.ValueRefCompanion with _root_.scala.Function0[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] {
      import _root_.scala.language.higherKinds;
      trait view[` C`[_]] extends ` lfdomainapi`.encoding.RecordView[` C`, view] { $u0020view =>
        final override def hoist[` D`[_]](` f` : _root_.scalaz.~>[` C`, ` D`]): view[` D`] = {
          final class $anon extends _root_.scala.AnyRef with view[` D`];
          new $anon()
        }
      };
      implicit val `IouTransfer_Cancel Value`: ` lfdomainapi`.Value[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] = {
        final class $anon extends this.`Value ValueRef`[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] {
          override def write(value: _root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel): ` rpcvalue`.Value.Sum = ` record`();
          override def read(argValue: ` rpcvalue`.Value.Sum): _root_.scala.Option[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] = argValue.record.flatMap(((x$1) => _root_.scala.Some(IouTransfer_Cancel())))
        };
        new $anon()
      };
      override protected val ` dataTypeId` = ` mkDataTypeId`(`Package IDs`.Iou, "Iou", "IouTransfer_Cancel");
      implicit def `IouTransfer_Cancel LfEncodable`: ` lfdomainapi`.encoding.LfEncodable[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] = {
        final class $anon extends ` lfdomainapi`.encoding.LfEncodable[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] {
          override def encoding(lte: ` lfdomainapi`.encoding.LfTypeEncoding): lte.Out[_root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel] = {
            object `view ` extends view[lte.Field];
            lte.emptyRecord(` dataTypeId`, (() => _root_.com.daml.quickstart.iou.model.Iou.IouTransfer_Cancel()))
          }
        };
        new $anon()
      }
    }
  }
}
