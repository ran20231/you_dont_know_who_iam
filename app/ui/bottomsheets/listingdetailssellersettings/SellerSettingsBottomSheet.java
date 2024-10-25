package com.forsale.app.ui.bottomsheets.listingdetailssellersettings;

import aa.k3;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.routing.plfRouting.shared.PLFResult;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.a0;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import t9.p0;
import t9.t0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
import yg.c;
/* compiled from: SellerSettingsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class SellerSettingsBottomSheet extends c<k3, SellerSettingsViewModel> {
    public static final a E = new a(null);
    public static final int F = 8;
    private final lr.a<m<?>> A;
    private final kr.b<m<?>> B;
    public cx.a<ag.a> C;
    private final androidx.activity.result.b<Intent> D;

    /* renamed from: j  reason: collision with root package name */
    private final int f38829j = t0.f70239k0;

    /* renamed from: x  reason: collision with root package name */
    private final h f38830x;

    /* renamed from: y  reason: collision with root package name */
    private final h f38831y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f38832z;

    /* compiled from: SellerSettingsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager) {
            o.i(fragmentManager, "fragmentManager");
            new SellerSettingsBottomSheet().show(fragmentManager, "SellerSettingsBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerSettingsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            SellerSettingsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public SellerSettingsBottomSheet() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.f38830x = FragmentViewModelLazyKt.b(this, s.b(SellerSettingsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$viewModels$default$4
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
                a aVar3 = a.this;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$viewModels$default$5
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
        this.f38831y = FragmentViewModelLazyKt.b(this, s.b(ListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.f38832z = true;
        lr.a<m<?>> aVar2 = new lr.a<>();
        this.A = aVar2;
        this.B = kr.b.f61943t.i(aVar2);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.a<ActivityResult>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1
            @Override // androidx.activity.result.a
            /* renamed from: b */
            public final void a(ActivityResult activityResult) {
                PLFResult a11;
                Intent a12 = activityResult.a();
                if (a12 != null && (a11 = PLFResult.f37812e.a(a12)) != null) {
                    final SellerSettingsBottomSheet sellerSettingsBottomSheet = SellerSettingsBottomSheet.this;
                    boolean d11 = a11.d();
                    SellerActionResultBottomSheet.a aVar3 = SellerActionResultBottomSheet.G;
                    SellerActionType sellerActionType = SellerActionType.MANUAL_RE_POST;
                    FragmentManager childFragmentManager = sellerSettingsBottomSheet.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    SellerActionResultBottomSheet.a.b(aVar3, sellerActionType, true, d11, null, childFragmentManager, false, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: INVOKE  
                          (r1v0 'aVar3' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a)
                          (r2v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                          true
                          (r4v0 'd11' boolean)
                          (null java.lang.String)
                          (r6v0 'childFragmentManager' androidx.fragment.app.FragmentManager)
                          false
                          (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0026: CONSTRUCTOR  (r8v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                          (r0v1 'sellerSettingsBottomSheet' com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet A[DONT_INLINE])
                         call: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1$onActivityResult$1$1.<init>(com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet):void type: CONSTRUCTOR)
                          (40 int)
                          (null java.lang.Object)
                         type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, boolean, boolean, java.lang.String, androidx.fragment.app.FragmentManager, boolean, g00.l, int, java.lang.Object):void in method: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1.b(androidx.activity.result.ActivityResult):void, file: classes3.dex
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1$onActivityResult$1$1, state: NOT_LOADED
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
                        	... 23 more
                        */
                    /*
                        this = this;
                        android.content.Intent r12 = r12.a()
                        if (r12 == 0) goto L2f
                        com.forsale.app.routing.plfRouting.shared.PLFResult$a r0 = com.forsale.app.routing.plfRouting.shared.PLFResult.f37812e
                        com.forsale.app.routing.plfRouting.shared.PLFResult r12 = r0.a(r12)
                        if (r12 == 0) goto L2f
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet r0 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet.this
                        boolean r4 = r12.d()
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a r1 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.G
                        com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r2 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.MANUAL_RE_POST
                        r3 = 1
                        r5 = 0
                        androidx.fragment.app.FragmentManager r6 = r0.getChildFragmentManager()
                        java.lang.String r12 = "getChildFragmentManager(...)"
                        kotlin.jvm.internal.o.h(r6, r12)
                        r7 = 0
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1$onActivityResult$1$1 r8 = new com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1$onActivityResult$1$1
                        r8.<init>(r0)
                        r9 = 40
                        r10 = 0
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    L2f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$launchPLFToRepostAd$1.a(androidx.activity.result.ActivityResult):void");
                }
            });
            o.h(registerForActivityResult, "registerForActivityResult(...)");
            this.D = registerForActivityResult;
        }

        private final void I(ListingItemDetails listingItemDetails) {
            BuildersKt__Builders_commonKt.launch$default(t(), null, null, new SellerSettingsBottomSheet$bindActions$1(this, listingItemDetails, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(ListingItemDetails listingItemDetails) {
            BuildersKt__Builders_commonKt.launch$default(t(), null, null, new SellerSettingsBottomSheet$openRepost$1(listingItemDetails, this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(boolean z11) {
            if (z11) {
                ListingDetailsViewModel.V1(K(), false, false, 3, null);
                dismiss();
            }
        }

        private final void Q() {
            OneShotEventHandler<p> w02 = t().w0();
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            w02.h(viewLifecycleOwner, new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(boolean z11) {
            if (z11) {
                ListingDetailsViewModel.V1(K(), false, false, 3, null);
                androidx.fragment.app.p activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                }
                androidx.fragment.app.p activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                dismiss();
            }
        }

        private final void T() {
            RecyclerView recyclerView = ((k3) r()).O;
            int dimension = (int) recyclerView.getContext().getResources().getDimension(p0.f69717q);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(false);
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.j(new a0(dimension, 0, dimension, 2, null));
            recyclerView.setAdapter(this.B);
        }

        public final cx.a<ag.a> J() {
            cx.a<ag.a> aVar = this.C;
            if (aVar != null) {
                return aVar;
            }
            o.w("plfRouterOperator");
            return null;
        }

        public final ListingDetailsViewModel K() {
            return (ListingDetailsViewModel) this.f38831y.getValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w9.b
        /* renamed from: L */
        public SellerSettingsViewModel t() {
            return (SellerSettingsViewModel) this.f38830x.getValue();
        }

        @Override // w9.b, androidx.fragment.app.j
        public int getTheme() {
            return z0.f70801k;
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            CrashlyticsUtilsKt.b("SellerSettingsBottomSheet", null, 2, null);
        }

        @Override // w9.b, androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            o.i(view, "view");
            super.onViewCreated(view, bundle);
            T();
            Q();
            ListingItemDetails value = K().Y0().getValue();
            if (value != null) {
                I(value);
            }
        }

        @Override // w9.b
        protected int s() {
            return this.f38829j;
        }

        @Override // w9.b
        public boolean w() {
            return this.f38832z;
        }
    }
