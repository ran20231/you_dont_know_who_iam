package com.forsale.designSystem.bottomsheets;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;
import g00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import v.k;
import vj.b;
import vj.d;
import wz.p;
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public final class SwipeableStateKt {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float c(float r3, float r4, java.util.Set<java.lang.Float> r5, g00.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.SwipeableStateKt.c(float, float, java.util.Set, g00.p, float, float):float");
    }

    private static final List<Float> d(float f11, Set<Float> set) {
        Float y02;
        Float A0;
        List<Float> q11;
        List<Float> e11;
        List<Float> e12;
        List<Float> r11;
        boolean z11;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = set2.iterator();
        while (true) {
            boolean z12 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) next).floatValue() > f11 + 0.001d) {
                z12 = false;
            }
            if (z12) {
                arrayList.add(next);
            }
        }
        y02 = CollectionsKt___CollectionsKt.y0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() >= f11 - 0.001d) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        A0 = CollectionsKt___CollectionsKt.A0(arrayList2);
        if (y02 == null) {
            r11 = r.r(A0);
            return r11;
        } else if (A0 == null) {
            e12 = q.e(y02);
            return e12;
        } else if (o.c(y02, A0)) {
            e11 = q.e(y02);
            return e11;
        } else {
            q11 = r.q(y02, A0);
            return q11;
        }
    }

    public static final <T> Float e(Map<Float, ? extends T> map, T t11) {
        T t12;
        Iterator<T> it2 = map.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                t12 = it2.next();
                if (o.d(((Map.Entry) t12).getValue(), t11)) {
                    break;
                }
            } else {
                t12 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t12;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    public static final <T> a f(SwipeableState<T> swipeableState, g00.a<p> onSwipeDown) {
        o.i(swipeableState, "<this>");
        o.i(onSwipeDown, "onSwipeDown");
        return new SwipeableStateKt$preUpPostDownNestedScrollConnection$1(swipeableState, onSwipeDown);
    }

    public static final <T> c g(c swipeable, SwipeableState<T> state, Map<Float, ? extends T> anchors, Orientation orientation, boolean z11, boolean z12, k kVar, g00.p<? super T, ? super T, ? extends d> thresholds, b bVar, float f11, g00.a<p> onSwipeDown) {
        l a11;
        o.i(swipeable, "$this$swipeable");
        o.i(state, "state");
        o.i(anchors, "anchors");
        o.i(orientation, "orientation");
        o.i(thresholds, "thresholds");
        o.i(onSwipeDown, "onSwipeDown");
        if (InspectableValueKt.c()) {
            a11 = new SwipeableStateKt$swipeableDfJExGQ$$inlined$debugInspectorInfo$1(state, anchors, orientation, z11, z12, kVar, thresholds, bVar, f11);
        } else {
            a11 = InspectableValueKt.a();
        }
        return ComposedModifierKt.a(swipeable, a11, new SwipeableStateKt$swipeable$3(anchors, state, orientation, z11, kVar, onSwipeDown, z12, bVar, thresholds, f11));
    }

    public static /* synthetic */ c h(c cVar, SwipeableState swipeableState, Map map, Orientation orientation, boolean z11, boolean z12, k kVar, g00.p pVar, b bVar, float f11, g00.a aVar, int i11, Object obj) {
        boolean z13;
        boolean z14;
        k kVar2;
        SwipeableStateKt$swipeable$1 swipeableStateKt$swipeable$1;
        b bVar2;
        float f12;
        if ((i11 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        if ((i11 & 32) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 64) != 0) {
            swipeableStateKt$swipeable$1 = SwipeableStateKt$swipeable$1.f40964a;
        } else {
            swipeableStateKt$swipeable$1 = pVar;
        }
        if ((i11 & 128) != 0) {
            bVar2 = vj.c.d(vj.c.f74574a, map.keySet(), 0.0f, 0.0f, 6, null);
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 256) != 0) {
            f12 = vj.c.f74574a.b();
        } else {
            f12 = f11;
        }
        return g(cVar, swipeableState, map, orientation, z13, z14, kVar2, swipeableStateKt$swipeable$1, bVar2, f12, aVar);
    }
}
