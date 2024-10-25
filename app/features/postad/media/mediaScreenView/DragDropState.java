package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.c0;
import g00.p;
import j0.k0;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import r.j;
/* compiled from: DragAndDrop.kt */
/* loaded from: classes2.dex */
public final class DragDropState {

    /* renamed from: a  reason: collision with root package name */
    private final LazyListState f36047a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f36048b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36049c;

    /* renamed from: d  reason: collision with root package name */
    private final p<Integer, Integer, wz.p> f36050d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f36051e;

    /* renamed from: f  reason: collision with root package name */
    private final Channel<Float> f36052f;

    /* renamed from: g  reason: collision with root package name */
    private final k0 f36053g;

    /* renamed from: h  reason: collision with root package name */
    private final k0 f36054h;

    /* renamed from: i  reason: collision with root package name */
    private final k0 f36055i;

    /* renamed from: j  reason: collision with root package name */
    private Animatable<Float, j> f36056j;

    /* JADX WARN: Multi-variable type inference failed */
    public DragDropState(LazyListState state, CoroutineScope scope, boolean z11, p<? super Integer, ? super Integer, wz.p> onMove) {
        k0 e11;
        k0 e12;
        k0 e13;
        k0 e14;
        o.i(state, "state");
        o.i(scope, "scope");
        o.i(onMove, "onMove");
        this.f36047a = state;
        this.f36048b = scope;
        this.f36049c = z11;
        this.f36050d = onMove;
        e11 = c0.e(null, null, 2, null);
        this.f36051e = e11;
        this.f36052f = ChannelKt.Channel$default(0, null, null, 7, null);
        e12 = c0.e(Float.valueOf(0.0f), null, 2, null);
        this.f36053g = e12;
        e13 = c0.e(0, null, 2, null);
        this.f36054h = e13;
        e14 = c0.e(null, null, 2, null);
        this.f36055i = e14;
        this.f36056j = r.a.b(0.0f, 0.0f, 2, null);
    }

    private final float d() {
        return ((Number) this.f36053g.getValue()).floatValue();
    }

    private final int f() {
        return ((Number) this.f36054h.getValue()).intValue();
    }

    private final x.j g() {
        Object obj;
        boolean z11;
        Iterator<T> it2 = this.f36047a.x().c().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                int index = ((x.j) obj).getIndex();
                Integer e11 = e();
                if (e11 != null && index == e11.intValue()) {
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
        return (x.j) obj;
    }

    private final int i(x.j jVar) {
        return jVar.getOffset() + jVar.d();
    }

    private final void p(float f11) {
        this.f36053g.setValue(Float.valueOf(f11));
    }

    private final void q(Integer num) {
        this.f36051e.setValue(num);
    }

    private final void r(int i11) {
        this.f36054h.setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Integer num) {
        this.f36055i.setValue(num);
    }

    public final Integer e() {
        return (Integer) this.f36051e.getValue();
    }

    public final float h() {
        x.j g11 = g();
        if (g11 != null) {
            if (this.f36049c) {
                return (g11.getOffset() - f()) + d();
            }
            return (f() + d()) - g11.getOffset();
        }
        return 0.0f;
    }

    public final Integer j() {
        return (Integer) this.f36055i.getValue();
    }

    public final Animatable<Float, j> k() {
        return this.f36056j;
    }

    public final Channel<Float> l() {
        return this.f36052f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.DragDropState.m(long):void");
    }

    public final void n() {
        if (e() != null) {
            s(e());
            BuildersKt__Builders_commonKt.launch$default(this.f36048b, null, null, new DragDropState$onDragInterrupted$1(this, h(), null), 3, null);
        }
        p(0.0f);
        q(null);
        r(0);
    }

    public final void o(long j11) {
        Object obj;
        int o11;
        Iterator<T> it2 = this.f36047a.x().c().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                x.j jVar = (x.j) obj;
                int offset = jVar.getOffset();
                int offset2 = jVar.getOffset() + jVar.d();
                if (this.f36049c) {
                    o11 = this.f36047a.x().e() - ((int) a1.f.o(j11));
                } else {
                    o11 = (int) a1.f.o(j11);
                }
                boolean z11 = false;
                if (offset <= o11 && o11 <= offset2) {
                    z11 = true;
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
        x.j jVar2 = (x.j) obj;
        if (jVar2 != null) {
            q(Integer.valueOf(jVar2.getIndex()));
            r(jVar2.getOffset());
        }
    }
}
