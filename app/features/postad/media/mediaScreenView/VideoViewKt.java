package com.forsale.app.features.postad.media.mediaScreenView;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import b2.f;
import com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel;
import com.forsale.app.features.postad.media.mediaScreenViewModel.VideoItemViewModel;
import com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.p;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import t9.q0;
import t9.y0;
import v0.b;
/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public final class VideoViewKt {
    public static final void a(final PostAdMediaViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
        boolean z11;
        o.i(viewModel, "viewModel");
        androidx.compose.runtime.a h11 = aVar.h(1193217121);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1193217121, i11, -1, "com.forsale.app.features.postad.media.mediaScreenView.AddVideoSection (VideoView.kt:38)");
        }
        final n1 a11 = LiveDataAdapterKt.a(viewModel.J0(), h11, 8);
        final n1 a12 = LiveDataAdapterKt.a(viewModel.E0(), h11, 8);
        bf.b b11 = b(a12);
        if (b11 != null && b11.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        VideoViewKt.a(PostAdMediaViewModel.this, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
                return;
            }
            return;
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c k11 = PaddingKt.k(aVar2, e2.h.l(16), 0.0f, 2, null);
        h11.C(-483455358);
        a0 a13 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a14 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a15 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(k11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a15);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a16 = Updater.a(h11);
        Updater.c(a16, a13, companion.e());
        Updater.c(a16, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        String b13 = p1.g.b(y0.f70406cc, h11, 0);
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        yj.d e11 = aVar3.a(h11, i12).e();
        int i13 = yj.d.f76453b;
        TextKt.a(b13, null, 0, 0, false, 0, 0, null, aVar3.c(h11, i12).l(), e11.m(h11, i13), 0, h11, 0, 0, 1278);
        SpacerKt.a(SizeKt.i(aVar2, e2.h.l(12)), h11, 6);
        androidx.compose.material.e.a(SizeKt.h(aVar2, 0.0f, 1, null), c0.g.c(e2.h.l(8)), aVar3.a(h11, i12).g().c(h11, i13), 0L, null, 0.0f, r0.b.b(h11, -1314759238, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar4, int i14) {
                final FragmentManager fragmentManager;
                bf.b b14;
                int i15;
                if ((i14 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1314759238, i14, -1, "com.forsale.app.features.postad.media.mediaScreenView.AddVideoSection.<anonymous>.<anonymous> (VideoView.kt:55)");
                }
                if (a11.getValue() == null) {
                    aVar4.C(664869462);
                    final PostAdMediaViewModel postAdMediaViewModel = viewModel;
                    g00.a<wz.p> aVar5 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1.1
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            PostAdMediaViewModel.P0(PostAdMediaViewModel.this, false, 1, null);
                        }
                    };
                    b14 = VideoViewKt.b(a12);
                    if (b14 != null) {
                        i15 = b14.d();
                    } else {
                        i15 = 15;
                    }
                    VideoViewKt.c(aVar5, i15, aVar4, 0);
                    aVar4.S();
                } else {
                    aVar4.C(664869675);
                    androidx.appcompat.app.d l12 = ContextExtensionsKt.l((Context) aVar4.q(AndroidCompositionLocals_androidKt.g()));
                    if (l12 != null) {
                        fragmentManager = l12.getSupportFragmentManager();
                    } else {
                        fragmentManager = null;
                    }
                    n1<VideoItemViewModel> n1Var = a11;
                    final PostAdMediaViewModel postAdMediaViewModel2 = viewModel;
                    g00.a<wz.p> aVar6 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            List q11;
                            PostAdMediaViewModel.this.X0();
                            q11 = r.q(new cg.a(y0.f70575mc, q0.f69795r1, h.f36281a), new cg.a(y0.f70440ec, q0.f69787p1, g.f36280a), new cg.a(y0.I4, q0.f69783o1, f.f36279a));
                            PLFMediaActionsBottomSheet pLFMediaActionsBottomSheet = new PLFMediaActionsBottomSheet(q11);
                            final PostAdMediaViewModel postAdMediaViewModel3 = PostAdMediaViewModel.this;
                            pLFMediaActionsBottomSheet.s(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0042: INVOKE  
                                  (r0v1 'pLFMediaActionsBottomSheet' com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet)
                                  (wrap: g00.l<java.lang.Object, wz.p> : 0x003f: CONSTRUCTOR  (r2v3 g00.l<java.lang.Object, wz.p> A[REMOVE]) = 
                                  (r1v3 'postAdMediaViewModel3' com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel A[DONT_INLINE])
                                 call: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1$2$1$1.<init>(com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet.s(g00.l):void in method: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1.2.invoke():void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1$2$1$1, state: NOT_LOADED
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
                                com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel r0 = com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel.this
                                r0.X0()
                                com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet r0 = new com.forsale.app.ui.bottomsheets.actionsBottomSheet.PLFMediaActionsBottomSheet
                                r1 = 3
                                cg.a[] r1 = new cg.a[r1]
                                cg.a r2 = new cg.a
                                int r3 = t9.y0.f70575mc
                                int r4 = t9.q0.f69795r1
                                com.forsale.app.features.postad.media.mediaScreenView.h r5 = com.forsale.app.features.postad.media.mediaScreenView.h.f36281a
                                r2.<init>(r3, r4, r5)
                                r3 = 0
                                r1[r3] = r2
                                cg.a r2 = new cg.a
                                int r3 = t9.y0.f70440ec
                                int r4 = t9.q0.f69787p1
                                com.forsale.app.features.postad.media.mediaScreenView.g r5 = com.forsale.app.features.postad.media.mediaScreenView.g.f36280a
                                r2.<init>(r3, r4, r5)
                                r3 = 1
                                r1[r3] = r2
                                cg.a r2 = new cg.a
                                int r3 = t9.y0.I4
                                int r4 = t9.q0.f69783o1
                                com.forsale.app.features.postad.media.mediaScreenView.f r5 = com.forsale.app.features.postad.media.mediaScreenView.f.f36279a
                                r2.<init>(r3, r4, r5)
                                r3 = 2
                                r1[r3] = r2
                                java.util.List r1 = kotlin.collections.p.q(r1)
                                r0.<init>(r1)
                                com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel r1 = com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel.this
                                com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1$2$1$1 r2 = new com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1$2$1$1
                                r2.<init>(r1)
                                r0.s(r2)
                                androidx.fragment.app.FragmentManager r1 = r2
                                if (r1 == 0) goto L4e
                                java.lang.String r2 = "Video_ACTIONS"
                                r0.show(r1, r2)
                            L4e:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1.AnonymousClass2.invoke2():void");
                        }
                    };
                    final n1<VideoItemViewModel> n1Var2 = a11;
                    final PostAdMediaViewModel postAdMediaViewModel3 = viewModel;
                    VideoViewKt.d(n1Var, aVar6, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$2$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            VideoItemViewModel value = n1Var2.getValue();
                            if (value != null) {
                                postAdMediaViewModel3.Z0(value);
                            }
                        }
                    }, aVar4, 0);
                    aVar4.S();
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                b(aVar4, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 1572870, 56);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$AddVideoSection$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    VideoViewKt.a(PostAdMediaViewModel.this, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf.b b(n1<bf.b> n1Var) {
        return n1Var.getValue();
    }

    public static final void c(final g00.a<wz.p> onUploadClicked, final int i11, androidx.compose.runtime.a aVar, final int i12) {
        int i13;
        androidx.compose.runtime.a aVar2;
        int i14;
        int i15;
        o.i(onUploadClicked, "onUploadClicked");
        androidx.compose.runtime.a h11 = aVar.h(-656565939);
        if ((i12 & 14) == 0) {
            if (h11.F(onUploadClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.d(i11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-656565939, i13, -1, "com.forsale.app.features.postad.media.mediaScreenView.NoVideoSelectedStateView (VideoView.kt:114)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c j11 = PaddingKt.j(aVar3, e2.h.l(f11), e2.h.l(12));
            b.InterfaceC0889b g11 = v0.b.f74009a.g();
            h11.C(-483455358);
            a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), g11, h11, 48);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(j11);
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
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            c0.f f12 = c0.g.f();
            dk.a aVar4 = dk.a.f54291a;
            int i16 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i16).e();
            int i17 = yj.d.f76453b;
            long h12 = e11.h(h11, i17);
            androidx.compose.ui.c p11 = SizeKt.p(aVar3, e2.h.l(56));
            ComposableSingletons$VideoViewKt composableSingletons$VideoViewKt = ComposableSingletons$VideoViewKt.f36021a;
            SurfaceKt.c(p11, f12, h12, 0L, null, 0.0f, composableSingletons$VideoViewKt.a(), h11, 1572870, 56);
            SpacerKt.a(SizeKt.i(aVar3, e2.h.l(8)), h11, 6);
            String b12 = p1.g.b(y0.f70541kc, h11, 0);
            androidx.compose.ui.text.a0 a15 = aVar4.c(h11, i16).a();
            f.a aVar5 = b2.f.f16081b;
            TextKt.a(b12, null, aVar5.a(), 0, false, 0, 0, null, a15, 0L, 0, h11, 0, 0, 1786);
            SpacerKt.a(SizeKt.i(aVar3, e2.h.l(4)), h11, 6);
            TextKt.a(p1.g.c(y0.f70524jc, new Object[]{15, Integer.valueOf(i11)}, h11, 64), SizeKt.h(aVar3, 0.0f, 1, null), aVar5.a(), 0, false, 0, 0, null, aVar4.c(h11, i16).d(), aVar4.a(h11, i16).e().j(h11, i17), 0, h11, 48, 0, 1272);
            SpacerKt.a(SizeKt.i(aVar3, e2.h.l(f11)), h11, 6);
            aVar2 = h11;
            ButtonsKt.e(onUploadClicked, SizeKt.h(aVar3, 0.0f, 1, null), ButtonData.f40994a.c(), false, false, null, composableSingletons$VideoViewKt.b(), h11, 1572912 | (i13 & 14) | (ButtonData.f40995b << 6), 56);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$NoVideoSelectedStateView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i18) {
                    VideoViewKt.c(onUploadClicked, i11, aVar6, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void d(final n1<VideoItemViewModel> videoUrl, final g00.a<wz.p> onOptionsClicked, final g00.a<wz.p> onViewVideoClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        LiveData<Boolean> liveData;
        n1 a11;
        boolean z11;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        o.i(videoUrl, "videoUrl");
        o.i(onOptionsClicked, "onOptionsClicked");
        o.i(onViewVideoClicked, "onViewVideoClicked");
        androidx.compose.runtime.a h11 = aVar.h(318191392);
        if ((i11 & 14) == 0) {
            if (h11.T(videoUrl)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onOptionsClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onViewVideoClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(318191392, i12, -1, "com.forsale.app.features.postad.media.mediaScreenView.VideoSelectedStateView (VideoView.kt:174)");
            }
            VideoItemViewModel value = videoUrl.getValue();
            if (value != null) {
                liveData = value.c();
            } else {
                liveData = null;
            }
            h11.C(-874296293);
            if (liveData == null) {
                a11 = null;
            } else {
                a11 = LiveDataAdapterKt.a(liveData, h11, 8);
            }
            h11.S();
            VideoItemViewModel value2 = videoUrl.getValue();
            if (value2 == null) {
                aVar2 = h11;
            } else {
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c b11 = androidx.compose.animation.c.b(SizeKt.w(aVar3, null, false, 3, null), null, null, 3, null);
                h11.C(733328855);
                b.a aVar4 = v0.b.f74009a;
                a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b11);
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
                Updater.c(a14, g11, companion.e());
                Updater.c(a14, s11, companion.g());
                p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b12);
                }
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                String e11 = value2.e();
                androidx.compose.ui.c i16 = SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), e2.h.l(180));
                h11.C(1157296644);
                boolean T = h11.T(onViewVideoClicked);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$VideoSelectedStateView$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onViewVideoClicked.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                androidx.compose.ui.c f11 = SizeKt.f(ClickableKt.e(i16, false, null, null, (g00.a) D, 7, null), 0.0f, 1, null);
                c.a aVar5 = androidx.compose.ui.layout.c.f8188a;
                com.skydoves.landscapist.glide.a.b(e11, f11, null, null, null, null, aVar5.a(), null, 0.0f, null, null, null, null, null, 0, h11, 14155776, 0, 32572);
                androidx.compose.ui.c p11 = SizeKt.p(PaddingKt.i(boxScopeInstance.e(aVar3, aVar4.n()), e2.h.l(12)), e2.h.l(32));
                dk.a aVar6 = dk.a.f54291a;
                int i17 = dk.a.f54292b;
                yj.d g12 = aVar6.a(h11, i17).g();
                int i18 = yj.d.f76453b;
                androidx.compose.ui.c a15 = BackgroundKt.a(p11, g12.c(h11, i18), c0.g.c(e2.h.l(4)));
                h11.C(1157296644);
                boolean T2 = h11.T(onOptionsClicked);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$VideoSelectedStateView$1$1$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onOptionsClicked.invoke();
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                androidx.compose.material.e.a(ClickableKt.e(a15, false, null, null, (g00.a) D2, 7, null), null, 0L, 0L, null, 0.0f, ComposableSingletons$VideoViewKt.f36021a.c(), h11, 1572864, 62);
                if (a11 != null) {
                    z11 = o.d(a11.getValue(), Boolean.TRUE);
                } else {
                    z11 = false;
                }
                if (z11) {
                    aVar2 = h11;
                    aVar2.C(-977544445);
                    ProgressIndicatorKt.a(boxScopeInstance.e(aVar3, aVar4.e()), aVar6.a(aVar2, i17).g().c(aVar2, i18), 0.0f, 0L, 0, aVar2, 0, 28);
                    aVar2.S();
                } else {
                    aVar2 = h11;
                    aVar2.C(-977544214);
                    ImageKt.a(p1.e.d(q0.f69804t2, aVar2, 0), null, boxScopeInstance.e(aVar3, aVar4.e()), null, aVar5.e(), 0.0f, null, aVar2, 24632, 104);
                    aVar2.S();
                }
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.VideoViewKt$VideoSelectedStateView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar7, int i19) {
                    VideoViewKt.d(videoUrl, onOptionsClicked, onViewVideoClicked, aVar7, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                    b(aVar7, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
