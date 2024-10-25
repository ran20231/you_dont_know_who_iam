package com.forsale.app.features.expiresoon;

import aa.e2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import com.forsale.app.utils.OneShotEventHandler;
import java.io.Serializable;
import kd.g;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: ExpireSoonOptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsBottomSheet extends g<e2, ExpireSoonOptionsViewModel> {
    public static final a C = new a(null);
    public static final int D = 8;
    public cx.a<ag.a> A;
    private final androidx.activity.result.b<Intent> B;

    /* renamed from: j  reason: collision with root package name */
    private final int f31231j = t0.U;

    /* renamed from: x  reason: collision with root package name */
    private boolean f31232x = true;

    /* renamed from: y  reason: collision with root package name */
    private g00.a<p> f31233y;

    /* renamed from: z  reason: collision with root package name */
    private final h f31234z;

    /* compiled from: ExpireSoonOptionsBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, g00.a<p> onDismissDialog) {
            o.i(fragmentManager, "fragmentManager");
            o.i(onDismissDialog, "onDismissDialog");
            ExpireSoonOptionsBottomSheet expireSoonOptionsBottomSheet = new ExpireSoonOptionsBottomSheet();
            expireSoonOptionsBottomSheet.f31233y = onDismissDialog;
            expireSoonOptionsBottomSheet.show(fragmentManager, "ExpireSoonOptionsBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonOptionsBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            ExpireSoonOptionsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonOptionsBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class c implements c0<Boolean> {
        c() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ExpireSoonOptionsViewModel t11 = ExpireSoonOptionsBottomSheet.this.t();
            o.f(bool);
            t11.R0(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonOptionsBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            ExpireSoonOptionsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public ExpireSoonOptionsBottomSheet() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f31234z = FragmentViewModelLazyKt.b(this, s.b(ExpireSoonOptionsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.a<ActivityResult>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1
            @Override // androidx.activity.result.a
            /* renamed from: b */
            public final void a(ActivityResult activityResult) {
                Serializable serializable;
                androidx.fragment.app.p activity = ExpireSoonOptionsBottomSheet.this.getActivity();
                if (activity != null) {
                    final ExpireSoonOptionsBottomSheet expireSoonOptionsBottomSheet = ExpireSoonOptionsBottomSheet.this;
                    SellerActionType.a aVar2 = SellerActionType.Companion;
                    Intent a11 = activityResult.a();
                    if (a11 != null) {
                        serializable = a11.getSerializableExtra("intention_key");
                    } else {
                        serializable = null;
                    }
                    o.g(serializable, "null cannot be cast to non-null type com.forsale.app.datalayer.network.entities.PostListingIntention");
                    SellerActionType a12 = aVar2.a((PostListingIntention) serializable);
                    if (a12 != null) {
                        SellerActionResultBottomSheet.a aVar3 = SellerActionResultBottomSheet.G;
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
                        SellerActionResultBottomSheet.a.b(aVar3, a12, true, true, null, supportFragmentManager, false, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: INVOKE  
                              (r3v1 'aVar3' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a)
                              (r4v0 'a12' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                              true
                              true
                              (null java.lang.String)
                              (r8v0 'supportFragmentManager' androidx.fragment.app.FragmentManager)
                              false
                              (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0038: CONSTRUCTOR  (r10v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = (r1v0 'expireSoonOptionsBottomSheet' com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet A[DONT_INLINE]) call: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1$onActivityResult$1$1$1.<init>(com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet):void type: CONSTRUCTOR)
                              (40 int)
                              (null java.lang.Object)
                             type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, boolean, boolean, java.lang.String, androidx.fragment.app.FragmentManager, boolean, g00.l, int, java.lang.Object):void in method: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1.b(androidx.activity.result.ActivityResult):void, file: classes2.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1$onActivityResult$1$1$1, state: NOT_LOADED
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
                            	... 31 more
                            */
                        /*
                            this = this;
                            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet r0 = com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet.this
                            androidx.fragment.app.p r0 = r0.getActivity()
                            if (r0 == 0) goto L41
                            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet r1 = com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet.this
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType$a r2 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.Companion
                            android.content.Intent r14 = r14.a()
                            if (r14 == 0) goto L19
                            java.lang.String r3 = "intention_key"
                            java.io.Serializable r14 = r14.getSerializableExtra(r3)
                            goto L1a
                        L19:
                            r14 = 0
                        L1a:
                            java.lang.String r3 = "null cannot be cast to non-null type com.forsale.app.datalayer.network.entities.PostListingIntention"
                            kotlin.jvm.internal.o.g(r14, r3)
                            com.forsale.app.datalayer.network.entities.PostListingIntention r14 = (com.forsale.app.datalayer.network.entities.PostListingIntention) r14
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r4 = r2.a(r14)
                            if (r4 == 0) goto L41
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a r3 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.G
                            r5 = 1
                            r6 = 1
                            r7 = 0
                            androidx.fragment.app.FragmentManager r8 = r0.getSupportFragmentManager()
                            java.lang.String r14 = "getSupportFragmentManager(...)"
                            kotlin.jvm.internal.o.h(r8, r14)
                            r9 = 0
                            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1$onActivityResult$1$1$1 r10 = new com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1$onActivityResult$1$1$1
                            r10.<init>(r1)
                            r11 = 40
                            r12 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        L41:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$plfLauncher$1.a(androidx.activity.result.ActivityResult):void");
                    }
                });
                o.h(registerForActivityResult, "registerForActivityResult(...)");
                this.B = registerForActivityResult;
            }

            private final void I() {
                OneShotEventHandler<p> E0 = t().E0();
                androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                E0.h(viewLifecycleOwner, new b());
                OneShotEventHandler<ListingDetailsEntity> D0 = t().D0();
                androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
                o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                D0.h(viewLifecycleOwner2, new ExpireSoonOptionsBottomSheet$registerObservers$2(this));
                OneShotEventHandler<ListingDetailsEntity> L0 = t().L0();
                androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
                o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                L0.h(viewLifecycleOwner3, new ExpireSoonOptionsBottomSheet$registerObservers$3(this));
                t().M0().observe(getViewLifecycleOwner(), new c());
                OneShotEventHandler<p> G0 = t().G0();
                androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
                o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                G0.h(viewLifecycleOwner4, new d());
            }

            public final cx.a<ag.a> G() {
                cx.a<ag.a> aVar = this.A;
                if (aVar != null) {
                    return aVar;
                }
                o.w("plfRouterOperator");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // w9.b
            /* renamed from: H */
            public ExpireSoonOptionsViewModel t() {
                return (ExpireSoonOptionsViewModel) this.f31234z.getValue();
            }

            @Override // w9.b, androidx.fragment.app.j
            public int getTheme() {
                return z0.f70801k;
            }

            @Override // w9.b, androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                o.i(view, "view");
                super.onViewCreated(view, bundle);
                I();
            }

            @Override // w9.b
            protected int s() {
                return this.f31231j;
            }

            @Override // w9.b
            public boolean w() {
                return this.f31232x;
            }
        }
