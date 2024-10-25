package com.forsale.app.features.postad.addons.calculatorNew;

import a1.g;
import aa.s1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.c;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import b1.i4;
import b1.v1;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import d1.f;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import me.b;
import okhttp3.internal.ws.WebSocketProtocol;
import p1.e;
import q1.n;
import t9.t0;
import t9.y0;
import t9.z0;
import v0.b;
import w.t;
import w.u;
import wz.h;
import wz.p;
/* compiled from: CalculatorDialogueBottomSheet.kt */
/* loaded from: classes2.dex */
public final class CalculatorDialogueBottomSheet extends b<s1, CalculatorDialogueViewModel> {
    private boolean A;

    /* renamed from: x  reason: collision with root package name */
    public CalculatorDialogueViewModel.a f34467x;

    /* renamed from: z  reason: collision with root package name */
    private final h f34469z;

    /* renamed from: j  reason: collision with root package name */
    private final int f34466j = t0.O;

    /* renamed from: y  reason: collision with root package name */
    private final h f34468y = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            w0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
            o.h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w3.a invoke() {
            w3.a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            t0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
            o.h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    public CalculatorDialogueBottomSheet() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ CalculatorDialogueBottomSheet f34493f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, CalculatorDialogueBottomSheet calculatorDialogueBottomSheet) {
                    super(fragment, bundle);
                    this.f34493f = calculatorDialogueBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel X;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    CalculatorDialogueViewModel.a V = this.f34493f.V();
                    X = this.f34493f.X();
                    CalculatorDialogueViewModel a11 = V.a(X);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f34469z = FragmentViewModelLazyKt.b(this, s.b(CalculatorDialogueViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.A = true;
    }

    private static final String J(j0.k0<String> k0Var) {
        return k0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel X() {
        return (PostAdViewModel) this.f34468y.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel r23, final boolean r24, androidx.compose.runtime.a r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.C(com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel, boolean, androidx.compose.runtime.a, int, int):void");
    }

    public final void D(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-2132161730);
        if ((i11 & 1) == 0 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-2132161730, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.DashedDividerCustom (CalculatorDialogueBottomSheet.kt:520)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = i4.f15925a.a(new float[]{20.0f, 10.0f}, 0.0f);
                h11.u(D);
            }
            h11.S();
            final i4 i4Var = (i4) D;
            CanvasKt.a(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(1)), new l<f, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DashedDividerCustom$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(f Canvas) {
                    o.i(Canvas, "$this$Canvas");
                    f.V(Canvas, v1.b(sj.c.f68660w), g.a(0.0f, 0.0f), g.a(a1.l.i(Canvas.b()), 0.0f), 0.0f, 0, i4.this, 0.0f, null, 0, 472, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(f fVar) {
                    b(fVar);
                    return p.f75480a;
                }
            }, h11, 6);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DashedDividerCustom$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    CalculatorDialogueBottomSheet.this.D(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void E(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-303614506);
        if (c.I()) {
            c.U(-303614506, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.DialogueHeader (CalculatorDialogueBottomSheet.kt:110)");
        }
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(f11), 0.0f, 0.0f, e2.h.l(f11), 6, null);
        h11.C(-270267587);
        h11.C(-3687241);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new Measurer();
            h11.u(D);
        }
        h11.S();
        final Measurer measurer = (Measurer) D;
        h11.C(-3687241);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = new ConstraintLayoutScope();
            h11.u(D2);
        }
        h11.S();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) D2;
        h11.C(-3687241);
        Object D3 = h11.D();
        if (D3 == c0064a.a()) {
            D3 = c0.e(Boolean.FALSE, null, 2, null);
            h11.u(D3);
        }
        h11.S();
        Pair<a0, g00.a<p>> f12 = ConstraintLayoutKt.f(257, constraintLayoutScope, (j0.k0) D3, measurer, h11, 4544);
        a0 a11 = f12.a();
        final g00.a<p> b11 = f12.b();
        LayoutKt.a(n.c(m11, false, new l<q1.s, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            public final void b(q1.s semantics) {
                o.i(semantics, "$this$semantics");
                i2.n.a(semantics, Measurer.this);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(q1.s sVar) {
                b(sVar);
                return p.f75480a;
            }
        }, 1, null), r0.b.b(h11, -819894182, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                if (((i12 & 11) ^ 2) == 0 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                int b12 = ConstraintLayoutScope.this.b();
                ConstraintLayoutScope.this.c();
                ConstraintLayoutScope constraintLayoutScope2 = ConstraintLayoutScope.this;
                ConstraintLayoutScope.a f13 = constraintLayoutScope2.f();
                final i2.c a12 = f13.a();
                i2.c b13 = f13.b();
                i2.c c11 = f13.c();
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c r11 = SizeKt.r(aVar3, e2.h.l(47), e2.h.l(5));
                dk.a aVar4 = dk.a.f54291a;
                int i13 = dk.a.f54292b;
                yj.d e11 = aVar4.a(aVar2, i13).e();
                int i14 = yj.d.f76453b;
                BoxKt.a(constraintLayoutScope2.d(BackgroundKt.a(r11, e11.d(aVar2, i14), c0.g.c(e2.h.l(3))), a12, CalculatorDialogueBottomSheet$DialogueHeader$1$1.f34511a), aVar2, 0);
                Painter d11 = e.d(t9.q0.f69766k0, aVar2, 0);
                androidx.compose.ui.layout.c d12 = androidx.compose.ui.layout.c.f8188a.d();
                aVar2.C(1157296644);
                boolean T = aVar2.T(a12);
                Object D4 = aVar2.D();
                if (T || D4 == androidx.compose.runtime.a.f7182a.a()) {
                    D4 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0096: CONSTRUCTOR  (r4v2 'D4' java.lang.Object) = (r12v0 'a12' i2.c A[DONT_INLINE]) call: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$1$2$1.<init>(i2.c):void type: CONSTRUCTOR in method: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$$inlined$ConstraintLayout$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$1$2$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        Method dump skipped, instructions count: 343
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$$inlined$ConstraintLayout$2.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), a11, h11, 48, 0);
            h11.S();
            G(h11, 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DialogueHeader$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        CalculatorDialogueBottomSheet.this.E(aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void G(androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(1239250093);
            if ((i11 & 1) == 0 && h11.i()) {
                h11.L();
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1239250093, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.DividerCustom (CalculatorDialogueBottomSheet.kt:514)");
                }
                DividerKt.a(null, dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b), e2.h.l(1), 0.0f, h11, 384, 9);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$DividerCustom$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        CalculatorDialogueBottomSheet.this.G(aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void H(final qf.c cVar, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(1072910046);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1072910046, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PaymentSummary (CalculatorDialogueBottomSheet.kt:283)");
            }
            L(h11, 8);
            if (cVar != null) {
                I(cVar, h11, 72);
                h11.C(1684489337);
                if (cVar.r()) {
                    K(cVar, h11, 72);
                }
                h11.S();
                M(cVar, h11, 72);
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummary$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        CalculatorDialogueBottomSheet.this.H(cVar, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void I(final qf.c paymentSummary, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a aVar2;
            int i12;
            dk.a aVar3;
            int i13;
            c.a aVar4;
            androidx.compose.runtime.a aVar5;
            int i14;
            int i15;
            String string;
            o.i(paymentSummary, "paymentSummary");
            androidx.compose.runtime.a h11 = aVar.h(-1364265676);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1364265676, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PaymentSummaryPrices (CalculatorDialogueBottomSheet.kt:339)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                if (paymentSummary.d() != null) {
                    w wVar = w.f61809a;
                    String string2 = getString(y0.Ia);
                    o.h(string2, "getString(...)");
                    string = String.format(string2, Arrays.copyOf(new Object[]{paymentSummary.d().getName()}, 1));
                    o.h(string, "format(...)");
                } else {
                    if (paymentSummary.g()) {
                        i15 = y0.La;
                    } else {
                        i15 = y0.Qa;
                    }
                    string = getString(i15);
                    o.h(string, "getString(...)");
                }
                D = c0.e(string, null, 2, null);
                h11.u(D);
            }
            h11.S();
            j0.k0 k0Var = (j0.k0) D;
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                w wVar2 = w.f61809a;
                D2 = String.format(TypeExtensionsKt.o(paymentSummary.n()) + " " + paymentSummary.e(), Arrays.copyOf(new Object[0], 0));
                o.h(D2, "format(...)");
                h11.u(D2);
            }
            h11.S();
            String str = (String) D2;
            h11.C(-492369756);
            Object D3 = h11.D();
            if (D3 == c0064a.a()) {
                w wVar3 = w.f61809a;
                String string3 = getString(y0.Ma);
                o.h(string3, "getString(...)");
                D3 = String.format(string3, Arrays.copyOf(new Object[]{TypeExtensionsKt.p(paymentSummary.b())}, 1));
                o.h(D3, "format(...)");
                h11.u(D3);
            }
            h11.S();
            String str2 = (String) D3;
            h11.C(-492369756);
            Object D4 = h11.D();
            if (D4 == c0064a.a()) {
                w wVar4 = w.f61809a;
                D4 = String.format(TypeExtensionsKt.o(paymentSummary.c()) + " " + paymentSummary.e(), Arrays.copyOf(new Object[0], 0));
                o.h(D4, "format(...)");
                h11.u(D4);
            }
            h11.S();
            String str3 = (String) D4;
            c.a aVar6 = androidx.compose.ui.c.f7566a;
            float f11 = 12;
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar6, 0.0f, 1, null), 0.0f, e2.h.l(f11), 0.0f, 0.0f, 13, null);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f o11 = arrangement.o(e2.h.l(f11));
            h11.C(-483455358);
            b.a aVar7 = v0.b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.e.a(o11, aVar7.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            float f12 = 24;
            androidx.compose.ui.c m12 = PaddingKt.m(SizeKt.h(aVar6, 0.0f, 1, null), e2.h.l(f12), 0.0f, e2.h.l(f12), 0.0f, 10, null);
            Arrangement.f e11 = arrangement.e();
            h11.C(693286680);
            a0 a15 = androidx.compose.foundation.layout.o.a(e11, aVar7.l(), h11, 6);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m12);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h11.C(-483455358);
            a0 a19 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar7.k(), h11, 0);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(aVar6);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a22);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(h11);
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            String J = J(k0Var);
            dk.a aVar8 = dk.a.f54291a;
            int i16 = dk.a.f54292b;
            androidx.compose.ui.text.a0 d11 = aVar8.c(h11, i16).d();
            yj.d e12 = aVar8.a(h11, i16).e();
            int i17 = yj.d.f76453b;
            TextKt.a(J, null, 0, 0, false, 0, 0, null, d11, e12.j(h11, i17), 0, h11, 0, 0, 1278);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.C(-483455358);
            a0 a24 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar7.k(), h11, 0);
            h11.C(-1323940314);
            int a25 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a26 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(aVar6);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a26);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a27 = Updater.a(h11);
            Updater.c(a27, a24, companion.e());
            Updater.c(a27, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
                a27.u(Integer.valueOf(a25));
                a27.p(Integer.valueOf(a25), b14);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            if (paymentSummary.p()) {
                h11.C(1260704125);
                aVar2 = h11;
                TextKt.a(p1.g.b(y0.Ra, h11, 0), null, 0, 0, false, 0, 0, null, aVar8.c(h11, i16).d(), aVar8.a(h11, i16).h().i(h11, i17), 0, aVar2, 0, 0, 1278);
                aVar2.S();
                aVar3 = aVar8;
                i12 = i17;
                i13 = i16;
            } else {
                aVar2 = h11;
                h11.C(1260704463);
                i12 = i17;
                aVar3 = aVar8;
                i13 = i16;
                TextKt.a(str, null, 0, 0, false, 0, 0, null, aVar8.c(h11, i16).d(), aVar8.a(h11, i16).e().j(h11, i17), 0, aVar2, 6, 0, 1278);
                aVar2.S();
            }
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            androidx.compose.runtime.a aVar9 = aVar2;
            aVar9.C(776460123);
            if (paymentSummary.k()) {
                androidx.compose.ui.c m13 = PaddingKt.m(SizeKt.h(aVar6, 0.0f, 1, null), e2.h.l(f12), 0.0f, e2.h.l(f12), 0.0f, 10, null);
                Arrangement.f e13 = arrangement.e();
                aVar9.C(693286680);
                a0 a28 = androidx.compose.foundation.layout.o.a(e13, aVar7.l(), aVar9, 6);
                aVar9.C(-1323940314);
                int a29 = j0.e.a(aVar9, 0);
                k s15 = aVar9.s();
                g00.a<ComposeUiNode> a31 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c15 = LayoutKt.c(m13);
                if (!(aVar9.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar9.I();
                if (aVar9.f()) {
                    aVar9.y(a31);
                } else {
                    aVar9.t();
                }
                androidx.compose.runtime.a a32 = Updater.a(aVar9);
                Updater.c(a32, a28, companion.e());
                Updater.c(a32, s15, companion.g());
                g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
                if (a32.f() || !o.d(a32.D(), Integer.valueOf(a29))) {
                    a32.u(Integer.valueOf(a29));
                    a32.p(Integer.valueOf(a29), b15);
                }
                c15.invoke(e1.a(e1.b(aVar9)), aVar9, 0);
                aVar9.C(2058660585);
                aVar9.C(-483455358);
                a0 a33 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar7.k(), aVar9, 0);
                aVar9.C(-1323940314);
                int a34 = j0.e.a(aVar9, 0);
                k s16 = aVar9.s();
                g00.a<ComposeUiNode> a35 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c16 = LayoutKt.c(aVar6);
                if (!(aVar9.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar9.I();
                if (aVar9.f()) {
                    aVar9.y(a35);
                } else {
                    aVar9.t();
                }
                androidx.compose.runtime.a a36 = Updater.a(aVar9);
                Updater.c(a36, a33, companion.e());
                Updater.c(a36, s16, companion.g());
                g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
                if (a36.f() || !o.d(a36.D(), Integer.valueOf(a34))) {
                    a36.u(Integer.valueOf(a34));
                    a36.p(Integer.valueOf(a34), b16);
                }
                c16.invoke(e1.a(e1.b(aVar9)), aVar9, 0);
                aVar9.C(2058660585);
                dk.a aVar10 = aVar3;
                int i18 = i13;
                int i19 = i12;
                aVar4 = aVar6;
                TextKt.a(str2, null, 0, 0, false, 0, 0, null, aVar10.c(aVar9, i18).d(), aVar10.a(aVar9, i18).e().j(aVar9, i19), 0, aVar9, 6, 0, 1278);
                aVar9.S();
                aVar9.w();
                aVar9.S();
                aVar9.S();
                aVar9.C(-483455358);
                a0 a37 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar7.k(), aVar9, 0);
                aVar9.C(-1323940314);
                int a38 = j0.e.a(aVar9, 0);
                k s17 = aVar9.s();
                g00.a<ComposeUiNode> a39 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c17 = LayoutKt.c(aVar4);
                if (!(aVar9.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar9.I();
                if (aVar9.f()) {
                    aVar9.y(a39);
                } else {
                    aVar9.t();
                }
                androidx.compose.runtime.a a41 = Updater.a(aVar9);
                Updater.c(a41, a37, companion.e());
                Updater.c(a41, s17, companion.g());
                g00.p<ComposeUiNode, Integer, p> b17 = companion.b();
                if (a41.f() || !o.d(a41.D(), Integer.valueOf(a38))) {
                    a41.u(Integer.valueOf(a38));
                    a41.p(Integer.valueOf(a38), b17);
                }
                c17.invoke(e1.a(e1.b(aVar9)), aVar9, 0);
                aVar9.C(2058660585);
                i14 = 0;
                aVar5 = aVar9;
                TextKt.a(str3, null, 0, 0, false, 0, 0, null, aVar10.c(aVar9, i18).d(), aVar10.a(aVar9, i18).e().j(aVar9, i19), 0, aVar5, 6, 0, 1278);
                aVar5.S();
                aVar5.w();
                aVar5.S();
                aVar5.S();
                aVar5.S();
                aVar5.w();
                aVar5.S();
                aVar5.S();
            } else {
                aVar4 = aVar6;
                aVar5 = aVar9;
                i14 = 0;
            }
            aVar5.S();
            androidx.compose.ui.c m14 = PaddingKt.m(aVar4, e2.h.l(f12), 0.0f, e2.h.l(f12), 0.0f, 10, null);
            androidx.compose.runtime.a aVar11 = aVar5;
            aVar11.C(693286680);
            a0 a42 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar7.l(), aVar11, i14);
            aVar11.C(-1323940314);
            int a43 = j0.e.a(aVar11, i14);
            k s18 = aVar11.s();
            g00.a<ComposeUiNode> a44 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c18 = LayoutKt.c(m14);
            if (!(aVar11.k() instanceof j0.d)) {
                j0.e.c();
            }
            aVar11.I();
            if (aVar11.f()) {
                aVar11.y(a44);
            } else {
                aVar11.t();
            }
            androidx.compose.runtime.a a45 = Updater.a(aVar11);
            Updater.c(a45, a42, companion.e());
            Updater.c(a45, s18, companion.g());
            g00.p<ComposeUiNode, Integer, p> b18 = companion.b();
            if (a45.f() || !o.d(a45.D(), Integer.valueOf(a43))) {
                a45.u(Integer.valueOf(a43));
                a45.p(Integer.valueOf(a43), b18);
            }
            c18.invoke(e1.a(e1.b(aVar11)), aVar11, Integer.valueOf(i14));
            aVar11.C(2058660585);
            D(aVar11, 8);
            aVar11.S();
            aVar11.w();
            aVar11.S();
            aVar11.S();
            aVar11.S();
            aVar11.w();
            aVar11.S();
            aVar11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = aVar11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryPrices$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar12, int i21) {
                        CalculatorDialogueBottomSheet.this.I(paymentSummary, aVar12, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar12, Integer num) {
                        b(aVar12, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void K(final qf.c paymentSummary, androidx.compose.runtime.a aVar, final int i11) {
            o.i(paymentSummary, "paymentSummary");
            androidx.compose.runtime.a h11 = aVar.h(356513338);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(356513338, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PaymentSummarySubtotal (CalculatorDialogueBottomSheet.kt:410)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                w wVar = w.f61809a;
                D = String.format(TypeExtensionsKt.o(paymentSummary.l()) + " " + paymentSummary.e(), Arrays.copyOf(new Object[0], 0));
                o.h(D, "format(...)");
                h11.u(D);
            }
            h11.S();
            String str = (String) D;
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                w wVar2 = w.f61809a;
                D2 = String.format(TypeExtensionsKt.o(paymentSummary.f()) + " " + paymentSummary.e(), Arrays.copyOf(new Object[0], 0));
                o.h(D2, "format(...)");
                h11.u(D2);
            }
            h11.S();
            String str2 = (String) D2;
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 24;
            float f12 = 12;
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(f11), e2.h.l(f12), e2.h.l(f11), 0.0f, 8, null);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f e11 = arrangement.e();
            h11.C(693286680);
            b.a aVar3 = v0.b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(e11, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h11.C(-483455358);
            a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            String b13 = p1.g.b(y0.Na, h11, 0);
            dk.a aVar4 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            androidx.compose.ui.text.a0 c13 = aVar4.c(h11, i12).c();
            yj.d e12 = aVar4.a(h11, i12).e();
            int i13 = yj.d.f76453b;
            TextKt.a(b13, null, 0, 0, false, 0, 0, null, c13, e12.m(h11, i13), 0, h11, 0, 0, 1278);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.C(-483455358);
            a0 a19 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a22);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(h11);
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b14);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            TextKt.a(str, null, 0, 0, false, 0, 0, null, aVar4.c(h11, i12).c(), aVar4.a(h11, i12).e().m(h11, i13), 0, h11, 6, 0, 1278);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(f11), e2.h.l(f12), e2.h.l(f11), e2.h.l(f12));
            Arrangement.f e13 = arrangement.e();
            h11.C(693286680);
            a0 a24 = androidx.compose.foundation.layout.o.a(e13, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a25 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a26 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c15 = LayoutKt.c(l11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a26);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a27 = Updater.a(h11);
            Updater.c(a27, a24, companion.e());
            Updater.c(a27, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
                a27.u(Integer.valueOf(a25));
                a27.p(Integer.valueOf(a25), b15);
            }
            c15.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.C(-483455358);
            a0 a28 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a29 = j0.e.a(h11, 0);
            k s15 = h11.s();
            g00.a<ComposeUiNode> a31 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c16 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a31);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a32 = Updater.a(h11);
            Updater.c(a32, a28, companion.e());
            Updater.c(a32, s15, companion.g());
            g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
            if (a32.f() || !o.d(a32.D(), Integer.valueOf(a29))) {
                a32.u(Integer.valueOf(a29));
                a32.p(Integer.valueOf(a29), b16);
            }
            c16.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            TextKt.a(p1.g.b(y0.Ja, h11, 0), null, 0, 0, false, 0, 0, null, aVar4.c(h11, i12).d(), aVar4.a(h11, i12).e().j(h11, i13), 0, h11, 0, 0, 1278);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.C(-483455358);
            a0 a33 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a34 = j0.e.a(h11, 0);
            k s16 = h11.s();
            g00.a<ComposeUiNode> a35 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c17 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a35);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a36 = Updater.a(h11);
            Updater.c(a36, a33, companion.e());
            Updater.c(a36, s16, companion.g());
            g00.p<ComposeUiNode, Integer, p> b17 = companion.b();
            if (a36.f() || !o.d(a36.D(), Integer.valueOf(a34))) {
                a36.u(Integer.valueOf(a34));
                a36.p(Integer.valueOf(a34), b17);
            }
            c17.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            TextKt.a(str2, null, 0, 0, false, 0, 0, null, aVar4.c(h11, i12).d(), aVar4.a(h11, i12).e().j(h11, i13), 0, h11, 6, 0, 1278);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c m12 = PaddingKt.m(aVar2, e2.h.l(f11), 0.0f, e2.h.l(f11), 0.0f, 10, null);
            h11.C(693286680);
            a0 a37 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
            h11.C(-1323940314);
            int a38 = j0.e.a(h11, 0);
            k s17 = h11.s();
            g00.a<ComposeUiNode> a39 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c18 = LayoutKt.c(m12);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a39);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a41 = Updater.a(h11);
            Updater.c(a41, a37, companion.e());
            Updater.c(a41, s17, companion.g());
            g00.p<ComposeUiNode, Integer, p> b18 = companion.b();
            if (a41.f() || !o.d(a41.D(), Integer.valueOf(a38))) {
                a41.u(Integer.valueOf(a38));
                a41.p(Integer.valueOf(a38), b18);
            }
            c18.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            G(h11, 8);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l12 = h11.l();
            if (l12 != null) {
                l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummarySubtotal$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i14) {
                        CalculatorDialogueBottomSheet.this.K(paymentSummary, aVar5, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void L(androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(-517661089);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-517661089, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PaymentSummaryTitle (CalculatorDialogueBottomSheet.kt:294)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 24;
            androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(f11), e2.h.l(f11), e2.h.l(f11), e2.h.l(12));
            h11.C(693286680);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.e g11 = arrangement.g();
            b.a aVar3 = v0.b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar3.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(l11);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar2, 0.0f, 1, null);
            h11.C(-270267587);
            h11.C(-3687241);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                D = new Measurer();
                h11.u(D);
            }
            h11.S();
            final Measurer measurer = (Measurer) D;
            h11.C(-3687241);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = new ConstraintLayoutScope();
                h11.u(D2);
            }
            h11.S();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) D2;
            h11.C(-3687241);
            Object D3 = h11.D();
            if (D3 == c0064a.a()) {
                D3 = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D3);
            }
            h11.S();
            Pair<a0, g00.a<p>> f12 = ConstraintLayoutKt.f(257, constraintLayoutScope, (j0.k0) D3, measurer, h11, 4544);
            a0 a15 = f12.a();
            final g00.a<p> b12 = f12.b();
            LayoutKt.a(n.c(h12, false, new l<q1.s, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$lambda$12$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                public final void b(q1.s semantics) {
                    o.i(semantics, "$this$semantics");
                    i2.n.a(semantics, Measurer.this);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(q1.s sVar) {
                    b(sVar);
                    return p.f75480a;
                }
            }, 1, null), r0.b.b(h11, -819894182, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$lambda$12$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    if (((i12 & 11) ^ 2) == 0 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    int b13 = ConstraintLayoutScope.this.b();
                    ConstraintLayoutScope.this.c();
                    ConstraintLayoutScope constraintLayoutScope2 = ConstraintLayoutScope.this;
                    ConstraintLayoutScope.a f13 = constraintLayoutScope2.f();
                    final i2.c a16 = f13.a();
                    i2.c b14 = f13.b();
                    Painter d11 = e.d(t9.q0.f69803t1, aVar4, 0);
                    c.a aVar5 = androidx.compose.ui.c.f7566a;
                    float f14 = 20;
                    ImageKt.a(d11, null, constraintLayoutScope2.d(SizeKt.i(SizeKt.u(aVar5, e2.h.l(f14)), e2.h.l(f14)), a16, CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$1.f34528a), null, null, 0.0f, null, aVar4, 56, 120);
                    String b15 = p1.g.b(y0.Oa, aVar4, 0);
                    androidx.compose.ui.c m11 = PaddingKt.m(aVar5, e2.h.l(6), 0.0f, 0.0f, 0.0f, 14, null);
                    aVar4.C(1157296644);
                    boolean T = aVar4.T(a16);
                    Object D4 = aVar4.D();
                    if (T || D4 == androidx.compose.runtime.a.f7182a.a()) {
                        D4 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0099: CONSTRUCTOR  (r4v6 'D4' java.lang.Object) = (r12v0 'a16' i2.c A[DONT_INLINE]) call: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$2$1.<init>(i2.c):void type: CONSTRUCTOR in method: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$lambda$12$$inlined$ConstraintLayout$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$2$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r20
                            r13 = r21
                            r1 = r22 & 11
                            r1 = r1 ^ 2
                            if (r1 != 0) goto L16
                            boolean r1 = r21.i()
                            if (r1 != 0) goto L11
                            goto L16
                        L11:
                            r21.L()
                            goto Le8
                        L16:
                            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = androidx.constraintlayout.compose.ConstraintLayoutScope.this
                            int r15 = r1.b()
                            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = androidx.constraintlayout.compose.ConstraintLayoutScope.this
                            r1.c()
                            androidx.constraintlayout.compose.ConstraintLayoutScope r11 = androidx.constraintlayout.compose.ConstraintLayoutScope.this
                            androidx.constraintlayout.compose.ConstraintLayoutScope$a r1 = r11.f()
                            i2.c r12 = r1.a()
                            i2.c r14 = r1.b()
                            int r1 = t9.q0.f69803t1
                            r10 = 0
                            androidx.compose.ui.graphics.painter.Painter r1 = p1.e.d(r1, r13, r10)
                            r2 = 0
                            androidx.compose.ui.c$a r9 = androidx.compose.ui.c.f7566a
                            r3 = 20
                            float r3 = (float) r3
                            float r4 = e2.h.l(r3)
                            androidx.compose.ui.c r4 = androidx.compose.foundation.layout.SizeKt.u(r9, r4)
                            float r3 = e2.h.l(r3)
                            androidx.compose.ui.c r3 = androidx.compose.foundation.layout.SizeKt.i(r4, r3)
                            com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$1 r4 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$1.f34528a
                            androidx.compose.ui.c r3 = r11.d(r3, r12, r4)
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r16 = 56
                            r17 = 120(0x78, float:1.68E-43)
                            r8 = r21
                            r18 = r9
                            r9 = r16
                            r22 = r15
                            r15 = r10
                            r10 = r17
                            androidx.compose.foundation.ImageKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                            int r1 = t9.y0.Oa
                            java.lang.String r1 = p1.g.b(r1, r13, r15)
                            r2 = 6
                            float r2 = (float) r2
                            float r4 = e2.h.l(r2)
                            r5 = 0
                            r7 = 0
                            r8 = 14
                            r9 = 0
                            r3 = r18
                            androidx.compose.ui.c r2 = androidx.compose.foundation.layout.PaddingKt.m(r3, r4, r5, r6, r7, r8, r9)
                            r3 = 1157296644(0x44faf204, float:2007.563)
                            r13.C(r3)
                            boolean r3 = r13.T(r12)
                            java.lang.Object r4 = r21.D()
                            if (r3 != 0) goto L97
                            androidx.compose.runtime.a$a r3 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r3 = r3.a()
                            if (r4 != r3) goto L9f
                        L97:
                            com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$2$1 r4 = new com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$1$1$2$1
                            r4.<init>(r12)
                            r13.u(r4)
                        L9f:
                            r21.S()
                            g00.l r4 = (g00.l) r4
                            androidx.compose.ui.c r2 = r11.d(r2, r14, r4)
                            dk.a r3 = dk.a.f54291a
                            int r4 = dk.a.f54292b
                            ek.w r5 = r3.c(r13, r4)
                            androidx.compose.ui.text.a0 r9 = r5.q()
                            yj.b r3 = r3.a(r13, r4)
                            yj.d r3 = r3.e()
                            int r4 = yj.d.f76453b
                            long r10 = r3.m(r13, r4)
                            b2.f$a r3 = b2.f.f16081b
                            int r3 = r3.a()
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r12 = 0
                            r14 = 0
                            r15 = 0
                            r16 = 1272(0x4f8, float:1.782E-42)
                            r13 = r21
                            r19 = r22
                            com.forsale.designSystem.TextKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16)
                            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = androidx.constraintlayout.compose.ConstraintLayoutScope.this
                            int r1 = r1.b()
                            r2 = r19
                            if (r1 == r2) goto Le8
                            g00.a r1 = r3
                            r1.invoke()
                        Le8:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$lambda$12$$inlined$ConstraintLayout$2.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                }), a15, h11, 48, 0);
                h11.S();
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                androidx.compose.ui.c m11 = PaddingKt.m(aVar2, e2.h.l(f11), 0.0f, e2.h.l(f11), 0.0f, 10, null);
                h11.C(693286680);
                a0 a16 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
                h11.C(-1323940314);
                int a17 = j0.e.a(h11, 0);
                k s12 = h11.s();
                g00.a<ComposeUiNode> a18 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m11);
                if (!(h11.k() instanceof j0.d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a18);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a19 = Updater.a(h11);
                Updater.c(a19, a16, companion.e());
                Updater.c(a19, s12, companion.g());
                g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                    a19.u(Integer.valueOf(a17));
                    a19.p(Integer.valueOf(a17), b13);
                }
                c12.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                G(h11, 8);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l12 = h11.l();
                if (l12 != null) {
                    l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTitle$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar4, int i12) {
                            CalculatorDialogueBottomSheet.this.L(aVar4, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public final void M(final qf.c paymentSummary, androidx.compose.runtime.a aVar, final int i11) {
                o.i(paymentSummary, "paymentSummary");
                androidx.compose.runtime.a h11 = aVar.h(-310768170);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-310768170, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PaymentSummaryTotal (CalculatorDialogueBottomSheet.kt:463)");
                }
                h11.C(-492369756);
                Object D = h11.D();
                if (D == androidx.compose.runtime.a.f7182a.a()) {
                    w wVar = w.f61809a;
                    D = String.format(TypeExtensionsKt.o(paymentSummary.m()) + " " + paymentSummary.e(), Arrays.copyOf(new Object[0], 0));
                    o.h(D, "format(...)");
                    h11.u(D);
                }
                h11.S();
                String str = (String) D;
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                float f11 = 24;
                androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(f11), e2.h.l(12), e2.h.l(f11), e2.h.l(f11));
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.f e11 = arrangement.e();
                h11.C(693286680);
                b.a aVar3 = v0.b.f74009a;
                a0 a11 = androidx.compose.foundation.layout.o.a(e11, aVar3.l(), h11, 6);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(l11);
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
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                u uVar = u.f74924a;
                h11.C(-483455358);
                a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
                h11.C(-1323940314);
                int a16 = j0.e.a(h11, 0);
                k s12 = h11.s();
                g00.a<ComposeUiNode> a17 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
                if (!(h11.k() instanceof j0.d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a17);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a18 = Updater.a(h11);
                Updater.c(a18, a15, companion.e());
                Updater.c(a18, s12, companion.g());
                g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.p(Integer.valueOf(a16), b12);
                }
                c12.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                w.f fVar = w.f.f74891a;
                String b13 = p1.g.b(y0.Pa, h11, 0);
                dk.a aVar4 = dk.a.f54291a;
                int i12 = dk.a.f54292b;
                androidx.compose.ui.text.a0 r11 = aVar4.c(h11, i12).r();
                yj.d e12 = aVar4.a(h11, i12).e();
                int i13 = yj.d.f76453b;
                TextKt.a(b13, null, 0, 0, false, 0, 0, null, r11, e12.m(h11, i13), 0, h11, 0, 0, 1278);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                h11.C(-483455358);
                a0 a19 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
                h11.C(-1323940314);
                int a21 = j0.e.a(h11, 0);
                k s13 = h11.s();
                g00.a<ComposeUiNode> a22 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(aVar2);
                if (!(h11.k() instanceof j0.d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a22);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a23 = Updater.a(h11);
                Updater.c(a23, a19, companion.e());
                Updater.c(a23, s13, companion.g());
                g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
                if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                    a23.u(Integer.valueOf(a21));
                    a23.p(Integer.valueOf(a21), b14);
                }
                c13.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                TextKt.a(str, null, 0, 0, false, 0, 0, null, aVar4.c(h11, i12).r(), aVar4.a(h11, i12).f().i(h11, i13), 0, h11, 6, 0, 1278);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l12 = h11.l();
                if (l12 != null) {
                    l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PaymentSummaryTotal$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar5, int i14) {
                            CalculatorDialogueBottomSheet.this.M(paymentSummary, aVar5, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                            b(aVar5, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public final void O(final qf.c cVar, androidx.compose.runtime.a aVar, final int i11) {
                int i12;
                androidx.compose.runtime.a h11 = aVar.h(1440484537);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1440484537, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PublishButton (CalculatorDialogueBottomSheet.kt:487)");
                }
                if (cVar != null) {
                    h11.C(-492369756);
                    Object D = h11.D();
                    if (D == androidx.compose.runtime.a.f7182a.a()) {
                        if (cVar.q()) {
                            i12 = y0.f70610od;
                        } else {
                            i12 = y0.f70627pd;
                        }
                        D = Integer.valueOf(i12);
                        h11.u(D);
                    }
                    h11.S();
                    final int intValue = ((Number) D).intValue();
                    c.a aVar2 = androidx.compose.ui.c.f7566a;
                    androidx.compose.ui.c i13 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(24));
                    h11.C(-483455358);
                    a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
                    h11.C(-1323940314);
                    int a12 = j0.e.a(h11, 0);
                    k s11 = h11.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i13);
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
                    c11.invoke(e1.a(e1.b(h11)), h11, 0);
                    h11.C(2058660585);
                    w.f fVar = w.f.f74891a;
                    ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PublishButton$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CalculatorDialogueBottomSheet.this.t().Q0();
                            CalculatorDialogueBottomSheet.this.dismiss();
                        }
                    }, SizeKt.h(aVar2, 0.0f, 1, null), null, null, false, false, null, r0.b.b(h11, 1990357589, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PublishButton$1$1$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(t PrimaryButton, androidx.compose.runtime.a aVar3, int i14) {
                            o.i(PrimaryButton, "$this$PrimaryButton");
                            if ((i14 & 81) == 16 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1990357589, i14, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.PublishButton.<anonymous>.<anonymous>.<anonymous> (CalculatorDialogueBottomSheet.kt:498)");
                            }
                            TextKt.a(p1.g.b(intValue, aVar3, 6), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar3, Integer num) {
                            b(tVar, aVar3, num.intValue());
                            return p.f75480a;
                        }
                    }), h11, 12582960, 124);
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$PublishButton$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i14) {
                            CalculatorDialogueBottomSheet.this.O(cVar, aVar3, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public final void Q(androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a h11 = aVar.h(1370588854);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1370588854, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.ShowDialog (CalculatorDialogueBottomSheet.kt:87)");
                }
                final qf.c cVar = (qf.c) z.b(t().J0(), null, h11, 8, 1).getValue();
                ThemeKt.a(null, null, r0.b.b(h11, -217291507, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$ShowDialog$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        boolean z11;
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-217291507, i12, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.ShowDialog.<anonymous> (CalculatorDialogueBottomSheet.kt:91)");
                        }
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
                        CalculatorDialogueBottomSheet calculatorDialogueBottomSheet = CalculatorDialogueBottomSheet.this;
                        qf.c cVar2 = cVar;
                        aVar2.C(-483455358);
                        Arrangement arrangement = Arrangement.f3698a;
                        Arrangement.m h13 = arrangement.h();
                        b.a aVar4 = v0.b.f74009a;
                        a0 a11 = androidx.compose.foundation.layout.e.a(h13, aVar4.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar = w.f.f74891a;
                        calculatorDialogueBottomSheet.E(aVar2, 8);
                        androidx.compose.ui.c a15 = fVar.a(SizeKt.h(ScrollKt.f(aVar3, ScrollKt.c(0, aVar2, 0, 1), false, null, false, 14, null), 0.0f, 1, null), 1.0f, false);
                        aVar2.C(-483455358);
                        a0 a16 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar4.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a17 = j0.e.a(aVar2, 0);
                        k s12 = aVar2.s();
                        g00.a<ComposeUiNode> a18 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(a15);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a18);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a19 = Updater.a(aVar2);
                        Updater.c(a19, a16, companion.e());
                        Updater.c(a19, s12, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                        if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                            a19.u(Integer.valueOf(a17));
                            a19.p(Integer.valueOf(a17), b12);
                        }
                        c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        if (cVar2 != null) {
                            z11 = cVar2.j();
                        } else {
                            z11 = false;
                        }
                        calculatorDialogueBottomSheet.C(null, z11, aVar2, AdRequest.MAX_CONTENT_URL_LENGTH, 1);
                        calculatorDialogueBottomSheet.H(cVar2, aVar2, 72);
                        calculatorDialogueBottomSheet.S(aVar2, 8);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        calculatorDialogueBottomSheet.O(cVar2, aVar2, 72);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$ShowDialog$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            CalculatorDialogueBottomSheet.this.Q(aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public final void S(androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a h11 = aVar.h(442516755);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(442516755, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.TermsAndConditions (CalculatorDialogueBottomSheet.kt:242)");
                }
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                float f11 = 24;
                androidx.compose.ui.c h12 = SizeKt.h(PaddingKt.m(aVar2, e2.h.l(f11), 0.0f, 0.0f, e2.h.l(8), 6, null), 0.0f, 1, null);
                h11.C(693286680);
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.e g11 = arrangement.g();
                b.a aVar3 = v0.b.f74009a;
                a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar3.l(), h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
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
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                u uVar = u.f74924a;
                h11.C(-801691516);
                c.a aVar4 = new c.a(0, 1, null);
                h11.C(-801691477);
                dk.a aVar5 = dk.a.f54291a;
                int i12 = dk.a.f54292b;
                androidx.compose.ui.text.u o11 = aVar5.c(h11, i12).o();
                yj.d e11 = aVar5.a(h11, i12).e();
                int i13 = yj.d.f76453b;
                int l11 = aVar4.l(androidx.compose.ui.text.u.b(o11, e11.j(h11, i13), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    aVar4.h(p1.g.b(y0.f70643qc, h11, 0));
                    p pVar = p.f75480a;
                    aVar4.j(l11);
                    h11.S();
                    aVar4.h(" ");
                    aVar4.k("termsClick", "termsClick");
                    l11 = aVar4.l(androidx.compose.ui.text.u.b(aVar5.c(h11, i12).p(), aVar5.a(h11, i12).e().m(h11, i13), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    try {
                        aVar4.h(p1.g.b(y0.f70626pc, h11, 0));
                        aVar4.j(l11);
                        aVar4.i();
                        final androidx.compose.ui.text.c m11 = aVar4.m();
                        h11.S();
                        ClickableTextKt.a(m11, null, null, false, 0, 0, null, new l<Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$TermsAndConditions$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(int i14) {
                                CalculatorDialogueBottomSheet calculatorDialogueBottomSheet;
                                Context context;
                                List<c.b<String>> h13 = androidx.compose.ui.text.c.this.h(r2, i14, i14);
                                if (h13.isEmpty()) {
                                    h13 = null;
                                }
                                if (h13 != null && (context = (calculatorDialogueBottomSheet = this).getContext()) != null) {
                                    WebActivity.a aVar6 = WebActivity.I;
                                    o.f(context);
                                    WebType webType = WebType.TERMS_CONDITIONS;
                                    String string = calculatorDialogueBottomSheet.getString(y0.f70455fa);
                                    o.h(string, "getString(...)");
                                    WebActivity.a.d(aVar6, context, webType, string, null, 0, null, 28, null);
                                }
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                                b(num.intValue());
                                return p.f75480a;
                            }
                        }, h11, 0, WebSocketProtocol.PAYLOAD_SHORT);
                        h11.S();
                        h11.w();
                        h11.S();
                        h11.S();
                        androidx.compose.ui.c m12 = PaddingKt.m(aVar2, e2.h.l(f11), 0.0f, e2.h.l(f11), 0.0f, 10, null);
                        h11.C(693286680);
                        a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
                        h11.C(-1323940314);
                        int a16 = j0.e.a(h11, 0);
                        k s12 = h11.s();
                        g00.a<ComposeUiNode> a17 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m12);
                        if (!(h11.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        h11.I();
                        if (h11.f()) {
                            h11.y(a17);
                        } else {
                            h11.t();
                        }
                        androidx.compose.runtime.a a18 = Updater.a(h11);
                        Updater.c(a18, a15, companion.e());
                        Updater.c(a18, s12, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                            a18.u(Integer.valueOf(a16));
                            a18.p(Integer.valueOf(a16), b12);
                        }
                        c12.invoke(e1.a(e1.b(h11)), h11, 0);
                        h11.C(2058660585);
                        G(h11, 8);
                        h11.S();
                        h11.w();
                        h11.S();
                        h11.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        d1 l12 = h11.l();
                        if (l12 != null) {
                            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$TermsAndConditions$3
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(androidx.compose.runtime.a aVar6, int i14) {
                                    CalculatorDialogueBottomSheet.this.S(aVar6, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                                    b(aVar6, num.intValue());
                                    return p.f75480a;
                                }
                            });
                        }
                    } finally {
                    }
                } finally {
                }
            }

            public final CalculatorDialogueViewModel.a V() {
                CalculatorDialogueViewModel.a aVar = this.f34467x;
                if (aVar != null) {
                    return aVar;
                }
                o.w("factory");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // w9.b
            /* renamed from: Y */
            public CalculatorDialogueViewModel t() {
                return (CalculatorDialogueViewModel) this.f34469z.getValue();
            }

            @Override // w9.b, androidx.fragment.app.j
            public int getTheme() {
                return z0.f70801k;
            }

            @Override // w9.b, androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                o.i(view, "view");
                super.onViewCreated(view, bundle);
                ((s1) r()).O.setContent(r0.b.c(-29573700, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet$onViewCreated$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-29573700, i11, -1, "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueBottomSheet.onViewCreated.<anonymous> (CalculatorDialogueBottomSheet.kt:82)");
                        }
                        CalculatorDialogueBottomSheet.this.Q(aVar, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
            }

            @Override // w9.b
            protected int s() {
                return this.f34466j;
            }

            @Override // w9.b
            public boolean w() {
                return this.A;
            }
        }
