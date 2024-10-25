package com.forsale.app.features.categories.listings;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kr.b;
import kr.m;
import t9.r0;
import wz.p;
/* compiled from: ListingsLayoutManager.kt */
/* loaded from: classes2.dex */
public final class ListingsLayoutManager extends GridLayoutManager {
    private final int R;
    private final b<m<?>> S;
    private final l<Integer, p> T;
    private int U;
    private final b0<Boolean> V;
    private final LiveData<Boolean> W;

    /* compiled from: ListingsLayoutManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends GridLayoutManager.c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i11) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z21;
            boolean z22;
            boolean z23;
            int itemViewType = ListingsLayoutManager.this.S.getItemViewType(i11);
            if (itemViewType == r0.Y3) {
                return 1;
            }
            boolean z24 = false;
            if (itemViewType == r0.J5 || itemViewType == r0.f69913g5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || itemViewType == r0.f69939i5) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 || itemViewType == r0.L5) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 || itemViewType == r0.G5) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14 || itemViewType == r0.f69925h4) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15 || itemViewType == r0.E5) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16 || itemViewType == r0.O0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17 || itemViewType == r0.f69966k6) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18 || itemViewType == r0.J9) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19 || itemViewType == r0.f69861c5) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (z21 || itemViewType == r0.Z4) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (z22 || itemViewType == r0.f70164z9) {
                z23 = true;
            } else {
                z23 = false;
            }
            if (z23 || itemViewType == r0.f70132x3) {
                z24 = true;
            }
            if (z24) {
                return ListingsLayoutManager.this.R;
            }
            return 1;
        }
    }

    public /* synthetic */ ListingsLayoutManager(Context context, int i11, b bVar, l lVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i11, bVar, (i12 & 8) != 0 ? null : lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void A1(int i11) {
        boolean z11;
        qc.a aVar;
        Integer a11;
        int intValue;
        if (s2() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.V.postValue(Boolean.valueOf(z11));
        m<?> n11 = this.S.n(z2());
        qc.b bVar = null;
        if (n11 instanceof qc.a) {
            aVar = (qc.a) n11;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            bVar = aVar.v();
        }
        if (!(bVar instanceof oc.a) || (a11 = ((oc.a) bVar).a()) == null || this.U >= (intValue = a11.intValue())) {
            return;
        }
        this.U = intValue;
        l<Integer, p> lVar = this.T;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(intValue));
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void u1(RecyclerView.z zVar) {
        l<Integer, p> lVar;
        super.u1(zVar);
        if (zVar != null && x2() == 0 && (lVar = this.T) != null) {
            lVar.invoke(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListingsLayoutManager(Context ctx, int i11, b<m<?>> screenAdapter, l<? super Integer, p> lVar) {
        super(ctx, i11);
        o.i(ctx, "ctx");
        o.i(screenAdapter, "screenAdapter");
        this.R = i11;
        this.S = screenAdapter;
        this.T = lVar;
        B3(new a());
        b0<Boolean> b0Var = new b0<>();
        this.V = b0Var;
        this.W = Transformations.a(b0Var);
    }
}
