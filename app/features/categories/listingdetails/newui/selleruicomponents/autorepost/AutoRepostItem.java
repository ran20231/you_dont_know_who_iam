package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost;

import aa.ei;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: AutoRepostItem.kt */
/* loaded from: classes2.dex */
public final class AutoRepostItem extends a<AutoRepostViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final AutoRepostViewModel f27701f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27702g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f27703h;

    /* renamed from: i  reason: collision with root package name */
    private final l<Boolean, p> f27704i;

    /* renamed from: j  reason: collision with root package name */
    private final int f27705j;

    /* renamed from: k  reason: collision with root package name */
    private final int f27706k;

    /* compiled from: AutoRepostItem.kt */
    /* loaded from: classes2.dex */
    public static final class AutoRepostViewHolder extends b.c<AutoRepostItem> {

        /* renamed from: a  reason: collision with root package name */
        private final ei f27707a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AutoRepostViewHolder(aa.ei r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27707a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem.AutoRepostViewHolder.<init>(aa.ei):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(AutoRepostItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            ei eiVar = this.f27707a;
            eiVar.h0(item.f27701f);
            eiVar.U(item.f27702g);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27702g), null, null, new AutoRepostItem$AutoRepostViewHolder$bindView$2(item, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(AutoRepostItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoRepostItem(AutoRepostViewModel autoRepostViewModel, s lifecycleOwner, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
        o.i(autoRepostViewModel, "autoRepostViewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(fragmentManager, "fragmentManager");
        o.i(onActionDone, "onActionDone");
        this.f27701f = autoRepostViewModel;
        this.f27702g = lifecycleOwner;
        this.f27703h = fragmentManager;
        this.f27704i = onActionDone;
        this.f27705j = t0.f70264n4;
        this.f27706k = r0.f69941i7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27706k;
    }

    @Override // pr.a
    public int t() {
        return this.f27705j;
    }

    public final FragmentManager x() {
        return this.f27703h;
    }

    public final l<Boolean, p> y() {
        return this.f27704i;
    }

    @Override // pr.a
    /* renamed from: z */
    public AutoRepostViewHolder u(View v11) {
        o.i(v11, "v");
        ei f02 = ei.f0(v11);
        o.h(f02, "bind(...)");
        return new AutoRepostViewHolder(f02);
    }
}
