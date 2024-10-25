package com.forsale.ui.components.flows;

import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.b0;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.z;
import e2.c;
import java.util.ArrayList;
import java.util.List;
import jk.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class FlowKt$Flow$1 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutOrientation f42662a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f42663b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SizeMode f42664c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f42665d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ MainAxisAlignment f42666e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ MainAxisAlignment f42667f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ FlowCrossAxisAlignment f42668g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt$Flow$1(LayoutOrientation layoutOrientation, float f11, SizeMode sizeMode, float f12, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, FlowCrossAxisAlignment flowCrossAxisAlignment) {
        this.f42662a = layoutOrientation;
        this.f42663b = f11;
        this.f42664c = sizeMode;
        this.f42665d = f12;
        this.f42666e = mainAxisAlignment;
        this.f42667f = mainAxisAlignment2;
        this.f42668g = flowCrossAxisAlignment;
    }

    private static final boolean j(List<o0> list, Ref$IntRef ref$IntRef, c0 c0Var, float f11, a aVar, LayoutOrientation layoutOrientation, o0 o0Var) {
        int d11;
        if (!list.isEmpty()) {
            int s02 = ref$IntRef.f61776a + c0Var.s0(f11);
            d11 = FlowKt.d(o0Var, layoutOrientation);
            if (s02 + d11 > aVar.b()) {
                return false;
            }
        }
        return true;
    }

    private static final void k(List<List<o0>> list, Ref$IntRef ref$IntRef, c0 c0Var, float f11, List<o0> list2, List<Integer> list3, Ref$IntRef ref$IntRef2, List<Integer> list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
        List<o0> X0;
        List<List<o0>> list5 = list;
        if (!list5.isEmpty()) {
            ref$IntRef.f61776a += c0Var.s0(f11);
        }
        X0 = CollectionsKt___CollectionsKt.X0(list2);
        list5.add(X0);
        list3.add(Integer.valueOf(ref$IntRef2.f61776a));
        list4.add(Integer.valueOf(ref$IntRef.f61776a));
        ref$IntRef.f61776a += ref$IntRef2.f61776a;
        ref$IntRef3.f61776a = Math.max(ref$IntRef3.f61776a, ref$IntRef4.f61776a);
        list2.clear();
        ref$IntRef4.f61776a = 0;
        ref$IntRef2.f61776a = 0;
    }

    @Override // androidx.compose.ui.layout.a0
    public final b0 c(c0 Layout, List<? extends z> measurables, long j11) {
        long b11;
        int max;
        int i11;
        int i12;
        Ref$IntRef ref$IntRef;
        ArrayList arrayList;
        Ref$IntRef ref$IntRef2;
        int d11;
        int c11;
        o.i(Layout, "$this$Layout");
        o.i(measurables, "measurables");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        ArrayList arrayList5 = new ArrayList();
        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
        Ref$IntRef ref$IntRef6 = new Ref$IntRef();
        a aVar = new a(j11, this.f42662a, null);
        if (this.f42662a == LayoutOrientation.Horizontal) {
            b11 = c.b(0, aVar.b(), 0, 0, 13, null);
        } else {
            b11 = c.b(0, 0, 0, aVar.b(), 7, null);
        }
        long j12 = b11;
        for (z zVar : measurables) {
            o0 P = zVar.P(j12);
            long j13 = j12;
            a aVar2 = aVar;
            Ref$IntRef ref$IntRef7 = ref$IntRef6;
            if (!j(arrayList5, ref$IntRef5, Layout, this.f42663b, aVar, this.f42662a, P)) {
                ref$IntRef = ref$IntRef5;
                arrayList = arrayList5;
                ref$IntRef2 = ref$IntRef4;
                k(arrayList2, ref$IntRef4, Layout, this.f42665d, arrayList5, arrayList3, ref$IntRef7, arrayList4, ref$IntRef3, ref$IntRef);
            } else {
                ref$IntRef = ref$IntRef5;
                arrayList = arrayList5;
                ref$IntRef2 = ref$IntRef4;
            }
            Ref$IntRef ref$IntRef8 = ref$IntRef;
            if (!arrayList.isEmpty()) {
                ref$IntRef8.f61776a += Layout.s0(this.f42663b);
            }
            ArrayList arrayList6 = arrayList;
            arrayList6.add(P);
            int i13 = ref$IntRef8.f61776a;
            d11 = FlowKt.d(P, this.f42662a);
            ref$IntRef8.f61776a = i13 + d11;
            ref$IntRef6 = ref$IntRef7;
            int i14 = ref$IntRef6.f61776a;
            c11 = FlowKt.c(P, this.f42662a);
            ref$IntRef6.f61776a = Math.max(i14, c11);
            arrayList5 = arrayList6;
            ref$IntRef5 = ref$IntRef8;
            aVar = aVar2;
            j12 = j13;
            ref$IntRef4 = ref$IntRef2;
        }
        a aVar3 = aVar;
        ArrayList arrayList7 = arrayList5;
        Ref$IntRef ref$IntRef9 = ref$IntRef4;
        Ref$IntRef ref$IntRef10 = ref$IntRef5;
        if (!arrayList7.isEmpty()) {
            k(arrayList2, ref$IntRef9, Layout, this.f42665d, arrayList7, arrayList3, ref$IntRef6, arrayList4, ref$IntRef3, ref$IntRef10);
        }
        if (aVar3.b() != Integer.MAX_VALUE && this.f42664c == SizeMode.Expand) {
            max = aVar3.b();
        } else {
            max = Math.max(ref$IntRef3.f61776a, aVar3.c());
        }
        int i15 = max;
        int max2 = Math.max(ref$IntRef9.f61776a, aVar3.a());
        LayoutOrientation layoutOrientation = this.f42662a;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            i11 = i15;
        } else {
            i11 = max2;
        }
        if (layoutOrientation == layoutOrientation2) {
            i12 = max2;
        } else {
            i12 = i15;
        }
        return c0.i1(Layout, i11, i12, null, new FlowKt$Flow$1$measure$1(arrayList2, Layout, this.f42663b, this.f42666e, this.f42667f, layoutOrientation, i15, this.f42668g, arrayList3, arrayList4, max2), 4, null);
    }
}
