package com.forsale.app.utils.popUpsPrioritizer;

import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
import wz.p;
import yz.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Prioritizer.kt */
/* loaded from: classes3.dex */
public final class PrioritizerImpl implements com.forsale.app.utils.popUpsPrioritizer.a {

    /* renamed from: b  reason: collision with root package name */
    public static final PrioritizerImpl f40390b = new PrioritizerImpl();

    /* renamed from: c  reason: collision with root package name */
    private static final h f40391c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<ij.a> f40392d;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = b.a(Integer.valueOf(((ij.a) t11).c().getPriority()), Integer.valueOf(((ij.a) t12).c().getPriority()));
            return a11;
        }
    }

    static {
        h a11;
        a11 = d.a(PrioritizerImpl$pendingPopUp$2.f40400a);
        f40391c = a11;
        f40392d = new ArrayList();
    }

    private PrioritizerImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        ij.a value = i().getValue();
        if (value != null) {
            f40392d.remove(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zz.a<? super wz.p> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$1 r0 = (com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$1) r0
            int r1 = r0.f40395c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40395c = r1
            goto L18
        L13:
            com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$1 r0 = new com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40393a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40395c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.f.b(r7)
            goto L46
        L38:
            kotlin.f.b(r7)
            r0.f40395c = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$2 r2 = new com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$2
            r4 = 0
            r2.<init>(r4)
            r0.f40395c = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl.h(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0<ij.a> i() {
        return (b0) f40391c.getValue();
    }

    @Override // com.forsale.app.utils.popUpsPrioritizer.a
    public Object a(ij.a aVar, zz.a<? super p> aVar2) {
        Object f11;
        if (o.d(aVar, i().getValue())) {
            Object h11 = h(aVar2);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (h11 == f11) {
                return h11;
            }
            return p.f75480a;
        }
        f40392d.remove(aVar);
        return p.f75480a;
    }

    @Override // com.forsale.app.utils.popUpsPrioritizer.a
    public Object b(ij.a aVar, zz.a<? super p> aVar2) {
        Object obj;
        Object f11;
        boolean z11;
        List<ij.a> list = f40392d;
        boolean isEmpty = list.isEmpty();
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((ij.a) obj).c() == aVar.c()) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((ij.a) obj) != null) {
            f40392d.remove(aVar);
        }
        List<ij.a> list2 = f40392d;
        list2.add(aVar);
        if (list2.size() > 1) {
            v.C(list2, new a());
        }
        if (isEmpty) {
            Object j11 = j(aVar2);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (j11 == f11) {
                return j11;
            }
            return p.f75480a;
        }
        return p.f75480a;
    }

    public Object j(zz.a<? super p> aVar) {
        Object f11;
        if (i().getValue() != null) {
            return p.f75480a;
        }
        Object h11 = h(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (h11 == f11) {
            return h11;
        }
        return p.f75480a;
    }
}
