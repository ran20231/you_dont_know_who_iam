package com.forsale.app.features.expiresoon;

import aa.y1;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.features.expiresoon.ExpireSoonViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kd.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: ExpireSoonBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonBottomSheet extends f<y1, ExpireSoonViewModel> {
    public static final a D = new a(null);
    public static final int E = 8;
    private g00.a<p> A;
    public ExpireSoonViewModel.a B;
    private final h C;

    /* renamed from: j  reason: collision with root package name */
    private final int f31216j = t0.R;

    /* renamed from: x  reason: collision with root package name */
    private boolean f31217x = true;

    /* renamed from: y  reason: collision with root package name */
    private AboutToExpireListing f31218y;

    /* renamed from: z  reason: collision with root package name */
    private ExpireSoonCoordinator f31219z;

    /* compiled from: ExpireSoonBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(AboutToExpireListing item, FragmentManager fragmentManager, ExpireSoonCoordinator coordinator, g00.a<p> onDismiss) {
            o.i(item, "item");
            o.i(fragmentManager, "fragmentManager");
            o.i(coordinator, "coordinator");
            o.i(onDismiss, "onDismiss");
            ExpireSoonBottomSheet expireSoonBottomSheet = new ExpireSoonBottomSheet();
            expireSoonBottomSheet.f31218y = item;
            expireSoonBottomSheet.f31219z = coordinator;
            expireSoonBottomSheet.K(onDismiss);
            expireSoonBottomSheet.show(fragmentManager, "ExpireSoonBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            ExpireSoonCoordinator expireSoonCoordinator = ExpireSoonBottomSheet.this.f31219z;
            AboutToExpireListing aboutToExpireListing = null;
            if (expireSoonCoordinator == null) {
                o.w("coordinator");
                expireSoonCoordinator = null;
            }
            AboutToExpireListing aboutToExpireListing2 = ExpireSoonBottomSheet.this.f31218y;
            if (aboutToExpireListing2 == null) {
                o.w("item");
            } else {
                aboutToExpireListing = aboutToExpireListing2;
            }
            expireSoonCoordinator.c(aboutToExpireListing.getId());
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            ExpireSoonBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public ExpireSoonBottomSheet() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ExpireSoonBottomSheet f31222f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, ExpireSoonBottomSheet expireSoonBottomSheet) {
                    super(fragment, bundle);
                    this.f31222f = expireSoonBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    ExpireSoonViewModel.a H = this.f31222f.H();
                    AboutToExpireListing aboutToExpireListing = this.f31222f.f31218y;
                    if (aboutToExpireListing == null) {
                        o.w("item");
                        aboutToExpireListing = null;
                    }
                    ExpireSoonViewModel a11 = H.a(aboutToExpireListing);
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
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.C = FragmentViewModelLazyKt.b(this, s.b(ExpireSoonViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    private final void J() {
        t().K0().observe(getViewLifecycleOwner(), b.f31223a);
        OneShotEventHandler<p> T0 = t().T0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        T0.h(viewLifecycleOwner, new c());
        OneShotEventHandler<p> M0 = t().M0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        M0.h(viewLifecycleOwner2, new FlowCollector<p>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                ExpireSoonCoordinator expireSoonCoordinator = ExpireSoonBottomSheet.this.f31219z;
                if (expireSoonCoordinator == null) {
                    o.w("coordinator");
                    expireSoonCoordinator = null;
                }
                final ExpireSoonBottomSheet expireSoonBottomSheet = ExpireSoonBottomSheet.this;
                expireSoonCoordinator.e(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE  
                      (r2v3 'expireSoonCoordinator' com.forsale.app.features.expiresoon.ExpireSoonCoordinator)
                      (wrap: g00.a<wz.p> : 0x0012: CONSTRUCTOR  (r3v1 g00.a<wz.p> A[REMOVE]) = (r0v0 'expireSoonBottomSheet' com.forsale.app.features.expiresoon.ExpireSoonBottomSheet A[DONT_INLINE]) call: com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3$emit$2.<init>(com.forsale.app.features.expiresoon.ExpireSoonBottomSheet):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.forsale.app.features.expiresoon.ExpireSoonCoordinator.e(g00.a):void in method: com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3.a(wz.p, zz.a<? super wz.p>):java.lang.Object, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3$emit$2, state: NOT_LOADED
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
                    com.forsale.app.features.expiresoon.ExpireSoonBottomSheet r2 = com.forsale.app.features.expiresoon.ExpireSoonBottomSheet.this
                    com.forsale.app.features.expiresoon.ExpireSoonCoordinator r2 = com.forsale.app.features.expiresoon.ExpireSoonBottomSheet.C(r2)
                    if (r2 != 0) goto Le
                    java.lang.String r2 = "coordinator"
                    kotlin.jvm.internal.o.w(r2)
                    r2 = 0
                Le:
                    com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3$emit$2 r3 = new com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3$emit$2
                    com.forsale.app.features.expiresoon.ExpireSoonBottomSheet r0 = com.forsale.app.features.expiresoon.ExpireSoonBottomSheet.this
                    r3.<init>(r0)
                    r2.e(r3)
                    wz.p r2 = wz.p.f75480a
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.expiresoon.ExpireSoonBottomSheet$registerObservers$3.emit(wz.p, zz.a):java.lang.Object");
            }
        });
        OneShotEventHandler<p> J0 = t().J0();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        J0.h(viewLifecycleOwner3, new d());
    }

    public final ExpireSoonViewModel.a H() {
        ExpireSoonViewModel.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: I */
    public ExpireSoonViewModel t() {
        return (ExpireSoonViewModel) this.C.getValue();
    }

    public final void K(g00.a<p> aVar) {
        this.A = aVar;
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f31218y != null && this.f31219z != null) {
            t().b1();
            t().Z0();
            g00.a<p> aVar = this.A;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("ExpireSoonBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        if (this.f31218y != null && this.f31219z != null) {
            super.onViewCreated(view, bundle);
            J();
            t().Y0();
            return;
        }
        dismiss();
    }

    @Override // w9.b
    protected int s() {
        return this.f31216j;
    }

    @Override // w9.b
    public boolean w() {
        return this.f31217x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31223a = new b();

        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(p pVar) {
        }
    }
}
