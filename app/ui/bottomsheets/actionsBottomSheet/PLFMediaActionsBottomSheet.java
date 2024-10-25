package com.forsale.app.ui.bottomsheets.actionsBottomSheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.ComposeView;
import cg.a;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.material.bottomsheet.d;
import e2.h;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import r0.b;
import t9.z0;
import wz.p;
/* compiled from: PLFMediaActionsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class PLFMediaActionsBottomSheet<T> extends d {

    /* renamed from: b  reason: collision with root package name */
    private final List<a<T>> f37860b;

    /* renamed from: c  reason: collision with root package name */
    private l<? super T, p> f37861c;

    public PLFMediaActionsBottomSheet(List<a<T>> actionsList) {
        o.i(actionsList, "actionsList");
        this.f37860b = actionsList;
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70802l;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(b.c(453183186, true, new g00.p<androidx.compose.runtime.a, Integer, p>(this) { // from class: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PLFMediaActionsBottomSheet<T> f37865a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f37865a = this;
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(453183186, i11, -1, "com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet.onCreateView.<anonymous>.<anonymous> (PLFMediaActionsBottomSheet.kt:39)");
                }
                final PLFMediaActionsBottomSheet<T> pLFMediaActionsBottomSheet = this.f37865a;
                ThemeKt.a(null, null, b.b(aVar, -2119910359, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(-2119910359, i12, -1, "com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (PLFMediaActionsBottomSheet.kt:41)");
                        }
                        androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(24), h.l(8));
                        final PLFMediaActionsBottomSheet<T> pLFMediaActionsBottomSheet2 = pLFMediaActionsBottomSheet;
                        LazyDslKt.a(j11, null, null, false, null, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet.onCreateView.1.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(LazyListScope LazyColumn) {
                                final List list;
                                o.i(LazyColumn, "$this$LazyColumn");
                                list = ((PLFMediaActionsBottomSheet) pLFMediaActionsBottomSheet2).f37860b;
                                final PLFMediaActionsBottomSheet<T> pLFMediaActionsBottomSheet3 = pLFMediaActionsBottomSheet2;
                                LazyColumn.f(list.size(), null, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                                      (r6v0 'LazyColumn' androidx.compose.foundation.lazy.LazyListScope)
                                      (wrap: int : 0x000d: INVOKE  (r2v0 int A[REMOVE]) = (r0v2 'list' java.util.List) type: INTERFACE call: java.util.List.size():int)
                                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0013: CONSTRUCTOR  (r3v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = (r0v2 'list' java.util.List A[DONT_INLINE]) call: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                                      (wrap: r0.a : 0x001f: INVOKE  (r0v4 r0.a A[REMOVE]) = 
                                      (-1091073711 int)
                                      true
                                      (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0018: CONSTRUCTOR  (r4v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                                      (r0v2 'list' java.util.List A[DONT_INLINE])
                                      (r1v0 'pLFMediaActionsBottomSheet3' com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet<T> A[DONT_INLINE])
                                     call: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet):void type: CONSTRUCTOR)
                                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                                     type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet.onCreateView.1.1.1.1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 15 more
                                    */
                                /*
                                    this = this;
                                    java.lang.String r0 = "$this$LazyColumn"
                                    kotlin.jvm.internal.o.i(r6, r0)
                                    com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet<T> r0 = r1
                                    java.util.List r0 = com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet.q(r0)
                                    com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet<T> r1 = r1
                                    int r2 = r0.size()
                                    com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$2 r3 = new com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$2
                                    r3.<init>(r0)
                                    com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$3 r4 = new com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1$1$1$invoke$$inlined$itemsIndexed$default$3
                                    r4.<init>(r0, r1)
                                    r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                                    r1 = 1
                                    r0.a r0 = r0.b.c(r0, r1, r4)
                                    r1 = 0
                                    r6.f(r2, r1, r3, r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet$onCreateView$1$1.AnonymousClass1.C04341.b(androidx.compose.foundation.lazy.LazyListScope):void");
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                                b(lazyListScope);
                                return p.f75480a;
                            }
                        }, aVar2, 0, 254);
                        if (c.I()) {
                            c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), aVar, 384, 3);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return p.f75480a;
            }
        }));
        return composeView;
    }

    public final l<T, p> r() {
        return (l<? super T, p>) this.f37861c;
    }

    public final void s(l<? super T, p> lVar) {
        this.f37861c = lVar;
    }
}
