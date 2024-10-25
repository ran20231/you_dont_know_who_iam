package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.m0;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.e1;
import j0.k;
import j0.u;
import j0.v0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import v0.i;
import wz.p;
/* compiled from: DragAndDrop.kt */
/* loaded from: classes2.dex */
public final class DragAndDropKt {
    public static final void a(final x.a aVar, final DragDropState dragDropState, final int i11, androidx.compose.ui.c cVar, final r<? super w.e, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, p> content, androidx.compose.runtime.a aVar2, final int i12, final int i13) {
        androidx.compose.ui.c cVar2;
        boolean z11;
        androidx.compose.ui.c c11;
        o.i(aVar, "<this>");
        o.i(dragDropState, "dragDropState");
        o.i(content, "content");
        androidx.compose.runtime.a h11 = aVar2.h(1083616262);
        if ((i13 & 4) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1083616262, i12, -1, "com.forsale.app.features.postad.media.mediaScreenView.DraggableItem (DragAndDrop.kt:184)");
        }
        Integer e11 = dragDropState.e();
        if (e11 != null && i11 == e11.intValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            c11 = androidx.compose.ui.graphics.b.a(i.a(androidx.compose.ui.c.f7566a, 1.0f), new l<androidx.compose.ui.graphics.c, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$DraggableItem$draggingModifier$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.graphics.c graphicsLayer) {
                    o.i(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.D(DragDropState.this.h());
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.graphics.c cVar3) {
                    b(cVar3);
                    return p.f75480a;
                }
            });
        } else {
            Integer j11 = dragDropState.j();
            if (j11 != null && i11 == j11.intValue()) {
                c11 = androidx.compose.ui.graphics.b.a(i.a(androidx.compose.ui.c.f7566a, 1.0f), new l<androidx.compose.ui.graphics.c, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$DraggableItem$draggingModifier$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(androidx.compose.ui.graphics.c graphicsLayer) {
                        o.i(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.D(DragDropState.this.k().m().floatValue());
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.graphics.c cVar3) {
                        b(cVar3);
                        return p.f75480a;
                    }
                });
            } else {
                c11 = x.a.c(aVar, androidx.compose.ui.c.f7566a, null, 1, null);
            }
        }
        androidx.compose.ui.c k11 = cVar2.k(c11);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(k11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        content.d(w.f.f74891a, Boolean.valueOf(z11), h11, Integer.valueOf(((i12 >> 6) & 896) | 6));
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final androidx.compose.ui.c cVar3 = cVar2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$DraggableItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    DragAndDropKt.a(x.a.this, dragDropState, i11, cVar3, content, aVar3, v0.a(i12 | 1), i13);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final androidx.compose.ui.c b(androidx.compose.ui.c cVar, DragDropState dragDropState) {
        o.i(cVar, "<this>");
        o.i(dragDropState, "dragDropState");
        return m0.c(cVar, dragDropState, new DragAndDropKt$dragContainer$1(dragDropState, null));
    }

    public static final DragDropState c(LazyListState lazyListState, boolean z11, g00.p<? super Integer, ? super Integer, p> onMove, androidx.compose.runtime.a aVar, int i11) {
        o.i(lazyListState, "lazyListState");
        o.i(onMove, "onMove");
        aVar.C(-879801559);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-879801559, i11, -1, "com.forsale.app.features.postad.media.mediaScreenView.rememberDragDropState (DragAndDrop.kt:29)");
        }
        aVar.C(773894976);
        aVar.C(-492369756);
        Object D = aVar.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            androidx.compose.runtime.f fVar = new androidx.compose.runtime.f(u.j(EmptyCoroutineContext.f61739a, aVar));
            aVar.u(fVar);
            D = fVar;
        }
        aVar.S();
        CoroutineScope a11 = ((androidx.compose.runtime.f) D).a();
        aVar.S();
        aVar.C(1157296644);
        boolean T = aVar.T(lazyListState);
        Object D2 = aVar.D();
        if (T || D2 == c0064a.a()) {
            D2 = new DragDropState(lazyListState, a11, z11, onMove);
            aVar.u(D2);
        }
        aVar.S();
        DragDropState dragDropState = (DragDropState) D2;
        u.d(dragDropState, new DragAndDropKt$rememberDragDropState$1(dragDropState, lazyListState, null), aVar, 72);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return dragDropState;
    }
}
