package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import aa.so;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.s;
import com.forsale.app.utils.ContextExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: WhatsAppMultipleUserItem.kt */
/* loaded from: classes3.dex */
public final class WhatsAppMultipleUserItem extends pr.a<SMSViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final ActionUserItemViewModel f38439f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38440g;

    /* renamed from: h  reason: collision with root package name */
    private final int f38441h;

    /* renamed from: i  reason: collision with root package name */
    private final int f38442i;

    /* compiled from: WhatsAppMultipleUserItem.kt */
    /* loaded from: classes3.dex */
    public static final class SMSViewHolder extends b.c<WhatsAppMultipleUserItem> {

        /* renamed from: a  reason: collision with root package name */
        private final so f38443a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SMSViewHolder(aa.so r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38443a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.WhatsAppMultipleUserItem.SMSViewHolder.<init>(aa.so):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(WhatsAppMultipleUserItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            final so soVar = this.f38443a;
            soVar.U(item.v());
            soVar.h0(item.x());
            item.x().w().h(item.v(), new FlowCollector<String>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.WhatsAppMultipleUserItem$SMSViewHolder$bindView$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(String str, zz.a<? super p> aVar) {
                    if (str != null) {
                        Context context = so.this.getRoot().getContext();
                        o.h(context, "getContext(...)");
                        ContextExtensionsKt.M(context, str, null, WhatsAppMultipleUserItem$SMSViewHolder$bindView$1$1$emit$2$1.f38445a, 2, null);
                    }
                    return p.f75480a;
                }
            });
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(WhatsAppMultipleUserItem item) {
            o.i(item, "item");
        }
    }

    public WhatsAppMultipleUserItem(ActionUserItemViewModel viewModel, s lifeCycle) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycle, "lifeCycle");
        this.f38439f = viewModel;
        this.f38440g = lifeCycle;
        this.f38441h = t0.W5;
        this.f38442i = r0.Eb;
    }

    @Override // kr.m
    public int getType() {
        return this.f38442i;
    }

    @Override // pr.a
    public int t() {
        return this.f38441h;
    }

    public final s v() {
        return this.f38440g;
    }

    @Override // pr.a
    /* renamed from: w */
    public SMSViewHolder u(View v11) {
        o.i(v11, "v");
        so f02 = so.f0(v11);
        o.h(f02, "bind(...)");
        return new SMSViewHolder(f02);
    }

    public final ActionUserItemViewModel x() {
        return this.f38439f;
    }
}
