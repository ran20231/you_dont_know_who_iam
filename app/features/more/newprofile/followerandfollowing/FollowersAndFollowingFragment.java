package com.forsale.app.features.more.newprofile.followerandfollowing;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s;
import com.forsale.app.feedback.FeedbackSnackBarComponentKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.NavBarsKt;
import e2.h;
import g00.l;
import g00.p;
import g00.q;
import j0.d1;
import j0.n1;
import j0.v0;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.SharedFlow;
import p1.g;
import r0.b;
import t9.y0;
import w.t;
/* compiled from: FollowersAndFollowingFragment.kt */
/* loaded from: classes2.dex */
public final class FollowersAndFollowingFragment extends Fragment {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel r23, androidx.compose.runtime.a r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.k(com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel, androidx.compose.runtime.a, int, int):void");
    }

    private static final fe.a m(n1<fe.a> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final SharedFlow<lf.a> sharedFlow, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1016521440);
        if (c.I()) {
            c.U(-1016521440, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.FollowersFeedBack (FollowersAndFollowingFragment.kt:130)");
        }
        float f11 = 16;
        FeedbackSnackBarComponentKt.a(PaddingKt.l(androidx.compose.ui.c.f7566a, h.l(f11), h.l(f11), h.l(f11), h.l(80)), sharedFlow, h11, 70, 0);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$FollowersFeedBack$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    FollowersAndFollowingFragment.this.o(sharedFlow, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(final l<? super Boolean, wz.p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar.h(-2094574976);
        if ((i11 & 14) == 0) {
            if (h11.F(lVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(this)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-2094574976, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.NavBar (FollowersAndFollowingFragment.kt:99)");
            }
            NavBarsKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, 0.0f, h.l(4), 0.0f, 11, null), b.b(h11, -1662266310, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r1v3 */
                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    if ((i15 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-1662266310, i15, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.NavBar.<anonymous> (FollowersAndFollowingFragment.kt:103)");
                    }
                    final FollowersAndFollowingFragment followersAndFollowingFragment = FollowersAndFollowingFragment.this;
                    aVar2.C(1157296644);
                    boolean T = aVar2.T(followersAndFollowingFragment);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = 
                              (r15v1 'followersAndFollowingFragment' com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment A[DONT_INLINE])
                             call: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1$1$1.<init>(com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment):void type: CONSTRUCTOR in method: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r15 & 11
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r14.i()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r14.L()
                            goto L7c
                        L10:
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.NavBar.<anonymous> (FollowersAndFollowingFragment.kt:103)"
                            r2 = -1662266310(0xffffffff9cebd43a, float:-1.5605855E-21)
                            androidx.compose.runtime.c.U(r2, r15, r0, r1)
                        L1f:
                            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment r15 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.this
                            r0 = 1157296644(0x44faf204, float:2007.563)
                            r14.C(r0)
                            boolean r0 = r14.T(r15)
                            java.lang.Object r1 = r14.D()
                            if (r0 != 0) goto L39
                            androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r0 = r0.a()
                            if (r1 != r0) goto L41
                        L39:
                            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1$1$1 r1 = new com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1$1$1
                            r1.<init>(r15)
                            r14.u(r1)
                        L41:
                            r14.S()
                            r2 = r1
                            g00.a r2 = (g00.a) r2
                            int r15 = sj.d.R
                            r0 = 0
                            androidx.compose.ui.graphics.painter.Painter r3 = p1.e.d(r15, r14, r0)
                            com.forsale.designSystem.buttons.IconButtonShape r4 = com.forsale.designSystem.buttons.IconButtonShape.Circle
                            com.forsale.designSystem.buttons.IconButtonSize r5 = com.forsale.designSystem.buttons.IconButtonSize.Large
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            dk.a r15 = dk.a.f54291a
                            int r0 = dk.a.f54292b
                            yj.b r15 = r15.a(r14, r0)
                            yj.d r15 = r15.e()
                            int r0 = yj.d.f76453b
                            long r0 = r15.m(r14, r0)
                            b1.t1 r9 = b1.t1.g(r0)
                            r11 = 3520(0xdc0, float:4.933E-42)
                            r12 = 112(0x70, float:1.57E-43)
                            r10 = r14
                            com.forsale.designSystem.buttons.IconButtonKt.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                            boolean r14 = androidx.compose.runtime.c.I()
                            if (r14 == 0) goto L7c
                            androidx.compose.runtime.c.T()
                        L7c:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), g.b(y0.f70556la, h11, 0), null, false, b.b(h11, -1184651506, true, new q<t, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v4 */
                    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.a] */
                    public final void b(t NavBarInner, androidx.compose.runtime.a aVar2, int i15) {
                        o.i(NavBarInner, "$this$NavBarInner");
                        if ((i15 & 81) == 16 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(-1184651506, i15, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.NavBar.<anonymous> (FollowersAndFollowingFragment.kt:115)");
                        }
                        final l<Boolean, wz.p> lVar2 = lVar;
                        aVar2.C(1157296644);
                        boolean T = aVar2.T(lVar2);
                        Object D = aVar2.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: CONSTRUCTOR  (r0v3 'D' java.lang.Object) = (r13v3 'lVar2' g00.l<java.lang.Boolean, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2$1$1.<init>(g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2.b(w.t, androidx.compose.runtime.a, int):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "$this$NavBarInner"
                                kotlin.jvm.internal.o.i(r13, r0)
                                r13 = r15 & 81
                                r0 = 16
                                if (r13 != r0) goto L16
                                boolean r13 = r14.i()
                                if (r13 != 0) goto L12
                                goto L16
                            L12:
                                r14.L()
                                goto L82
                            L16:
                                boolean r13 = androidx.compose.runtime.c.I()
                                if (r13 == 0) goto L25
                                r13 = -1
                                java.lang.String r0 = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.NavBar.<anonymous> (FollowersAndFollowingFragment.kt:115)"
                                r1 = -1184651506(0xffffffffb963a70e, float:-2.171064E-4)
                                androidx.compose.runtime.c.U(r1, r15, r13, r0)
                            L25:
                                g00.l<java.lang.Boolean, wz.p> r13 = r1
                                r15 = 1157296644(0x44faf204, float:2007.563)
                                r14.C(r15)
                                boolean r15 = r14.T(r13)
                                java.lang.Object r0 = r14.D()
                                if (r15 != 0) goto L3f
                                androidx.compose.runtime.a$a r15 = androidx.compose.runtime.a.f7182a
                                java.lang.Object r15 = r15.a()
                                if (r0 != r15) goto L47
                            L3f:
                                com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2$1$1 r0 = new com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2$1$1
                                r0.<init>(r13)
                                r14.u(r0)
                            L47:
                                r14.S()
                                r1 = r0
                                g00.a r1 = (g00.a) r1
                                int r13 = t9.q0.f69810v0
                                r15 = 0
                                androidx.compose.ui.graphics.painter.Painter r2 = p1.e.d(r13, r14, r15)
                                com.forsale.designSystem.buttons.IconButtonShape r3 = com.forsale.designSystem.buttons.IconButtonShape.Circle
                                com.forsale.designSystem.buttons.IconButtonSize r4 = com.forsale.designSystem.buttons.IconButtonSize.Large
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                dk.a r13 = dk.a.f54291a
                                int r15 = dk.a.f54292b
                                yj.b r13 = r13.a(r14, r15)
                                yj.d r13 = r13.e()
                                int r15 = yj.d.f76453b
                                long r8 = r13.m(r14, r15)
                                b1.t1 r8 = b1.t1.g(r8)
                                r10 = 3520(0xdc0, float:4.933E-42)
                                r11 = 112(0x70, float:1.57E-43)
                                r9 = r14
                                com.forsale.designSystem.buttons.IconButtonKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                boolean r13 = androidx.compose.runtime.c.I()
                                if (r13 == 0) goto L82
                                androidx.compose.runtime.c.T()
                            L82:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$2.b(w.t, androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ wz.p invoke(t tVar, androidx.compose.runtime.a aVar2, Integer num) {
                            b(tVar, aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    }), h11, 221238, 8);
                    if (c.I()) {
                        c.T();
                    }
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$NavBar$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i15) {
                            FollowersAndFollowingFragment.this.p(lVar, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }

            @Override // androidx.fragment.app.Fragment
            public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
                o.i(inflater, "inflater");
                super.onCreateView(inflater, viewGroup, bundle);
                Context requireContext = requireContext();
                o.h(requireContext, "requireContext(...)");
                ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
                s viewLifecycleOwner = getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
                composeView.setContent(b.c(-409740267, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$onCreateView$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(-409740267, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.onCreateView.<anonymous>.<anonymous> (FollowersAndFollowingFragment.kt:60)");
                        }
                        final FollowersAndFollowingFragment followersAndFollowingFragment = FollowersAndFollowingFragment.this;
                        ThemeKt.a(null, null, b.b(aVar, 1770430366, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment$onCreateView$1$1.1
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                if ((i12 & 11) == 2 && aVar2.i()) {
                                    aVar2.L();
                                    return;
                                }
                                if (c.I()) {
                                    c.U(1770430366, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (FollowersAndFollowingFragment.kt:61)");
                                }
                                FollowersAndFollowingFragment.this.k(null, aVar2, 0, 1);
                                if (c.I()) {
                                    c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return wz.p.f75480a;
                            }
                        }), aVar, 384, 3);
                        if (c.I()) {
                            c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return wz.p.f75480a;
                    }
                }));
                return composeView;
            }
        }
