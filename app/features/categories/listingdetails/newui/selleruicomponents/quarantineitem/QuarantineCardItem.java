package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import aa.yk;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
/* compiled from: QuarantineCardItem.kt */
/* loaded from: classes2.dex */
public final class QuarantineCardItem extends a<QuarantineViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final QuarantineCardViewModel f27904f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27905g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27906h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27907i;

    /* compiled from: QuarantineCardItem.kt */
    /* loaded from: classes2.dex */
    public static final class QuarantineViewHolder extends b.c<QuarantineCardItem> {

        /* renamed from: a  reason: collision with root package name */
        private final yk f27908a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public QuarantineViewHolder(aa.yk r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27908a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem.QuarantineViewHolder.<init>(aa.yk):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(Context context) {
            Intent intent;
            if (Build.VERSION.SDK_INT >= 26) {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                String packageName = context.getPackageName();
                intent.setData(Uri.parse("package:" + packageName));
            }
            context.startActivity(intent);
        }

        @Override // kr.b.c
        /* renamed from: h */
        public void b(QuarantineCardItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            yk ykVar = this.f27908a;
            ykVar.h0(item.w());
            ykVar.U(item.v());
            BuildersKt__Builders_commonKt.launch$default(t.a(item.v()), null, null, new QuarantineCardItem$QuarantineViewHolder$bindView$2(item, this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.v()), null, null, new QuarantineCardItem$QuarantineViewHolder$bindView$3(item, this, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: j */
        public void e(QuarantineCardItem item) {
            o.i(item, "item");
        }
    }

    public QuarantineCardItem(QuarantineCardViewModel viemModel, s lifeCycle) {
        o.i(viemModel, "viemModel");
        o.i(lifeCycle, "lifeCycle");
        this.f27904f = viemModel;
        this.f27905g = lifeCycle;
        this.f27906h = t0.X4;
        this.f27907i = r0.G7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27907i;
    }

    @Override // pr.a
    public int t() {
        return this.f27906h;
    }

    public final s v() {
        return this.f27905g;
    }

    public final QuarantineCardViewModel w() {
        return this.f27904f;
    }

    @Override // pr.a
    /* renamed from: x */
    public QuarantineViewHolder u(View v11) {
        o.i(v11, "v");
        yk f02 = yk.f0(v11);
        o.h(f02, "bind(...)");
        return new QuarantineViewHolder(f02);
    }
}
