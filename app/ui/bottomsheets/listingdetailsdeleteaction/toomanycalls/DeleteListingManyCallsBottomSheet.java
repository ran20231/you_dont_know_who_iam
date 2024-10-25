package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls;

import aa.w2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.DeleteUtils;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: DeleteListingManyCallsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class DeleteListingManyCallsBottomSheet extends sg.b<w2, DeleteListingManyCallsViewModel> {
    public static final a C = new a(null);
    public static final int D = 8;
    private final h A;
    private boolean B;

    /* renamed from: j  reason: collision with root package name */
    private final l<Boolean, p> f38272j;

    /* renamed from: x  reason: collision with root package name */
    private final int f38273x;

    /* renamed from: y  reason: collision with root package name */
    public DeleteListingManyCallsViewModel.a f38274y;

    /* renamed from: z  reason: collision with root package name */
    private final h f38275z;

    /* compiled from: DeleteListingManyCallsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            new DeleteListingManyCallsBottomSheet(onActionDone).show(fragmentManager, "DeleteListingManyCallsBottomSheet");
        }
    }

    /* compiled from: DeleteListingManyCallsBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            DeleteListingManyCallsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: DeleteListingManyCallsBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<Boolean> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super p> aVar) {
            ItemStatus itemStatus;
            boolean z11;
            if (bool != null) {
                DeleteListingManyCallsBottomSheet deleteListingManyCallsBottomSheet = DeleteListingManyCallsBottomSheet.this;
                boolean booleanValue = bool.booleanValue();
                ListingItemDetails value = DeleteListingManyCallsBottomSheet.this.E().Y0().getValue();
                if (value != null) {
                    itemStatus = value.getStatus();
                } else {
                    itemStatus = null;
                }
                if (itemStatus == ItemStatus.DRAFT) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                DeleteUtils.b(deleteListingManyCallsBottomSheet, booleanValue, z11, false, null, DeleteListingManyCallsBottomSheet.this.f38272j, 24, null);
            }
            return p.f75480a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteListingManyCallsBottomSheet(l<? super Boolean, p> onActionDone) {
        h b11;
        o.i(onActionDone, "onActionDone");
        this.f38272j = onActionDone;
        this.f38273x = t0.f70190d0;
        this.f38275z = FragmentViewModelLazyKt.b(this, s.b(ListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$special$$inlined$activityViewModels$default$3
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
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ DeleteListingManyCallsBottomSheet f38282f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, DeleteListingManyCallsBottomSheet deleteListingManyCallsBottomSheet) {
                    super(fragment, bundle);
                    this.f38282f = deleteListingManyCallsBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    DeleteListingManyCallsViewModel a11 = this.f38282f.D().a(this.f38282f.E());
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
        this.A = FragmentViewModelLazyKt.b(this, s.b(DeleteListingManyCallsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.B = true;
    }

    public final DeleteListingManyCallsViewModel.a D() {
        DeleteListingManyCallsViewModel.a aVar = this.f38274y;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final ListingDetailsViewModel E() {
        return (ListingDetailsViewModel) this.f38275z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: G */
    public DeleteListingManyCallsViewModel t() {
        return (DeleteListingManyCallsViewModel) this.A.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> B0 = t().B0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        B0.h(viewLifecycleOwner, new b());
        OneShotEventHandler<ListingItemDetails> z02 = t().z0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner2, new FlowCollector<ListingItemDetails>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(ListingItemDetails listingItemDetails, zz.a<? super p> aVar) {
                if (listingItemDetails != null) {
                    SellerActionBottomSheet.a aVar2 = SellerActionBottomSheet.K;
                    SellerActionType sellerActionType = SellerActionType.ADD_ADDITIONAL_NUMBER;
                    AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = AggregatedAllAnalyticsLogger.AnalyticsPosition.DELETE_ACTION;
                    FragmentManager childFragmentManager = DeleteListingManyCallsBottomSheet.this.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    final DeleteListingManyCallsBottomSheet deleteListingManyCallsBottomSheet = DeleteListingManyCallsBottomSheet.this;
                    aVar2.a(sellerActionType, listingItemDetails, analyticsPosition, childFragmentManager, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
                          (r0v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a)
                          (r1v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                          (r7v0 'listingItemDetails' com.forsale.app.datalayer.network.responses.ListingItemDetails)
                          (r3v0 'analyticsPosition' com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition)
                          (r4v0 'childFragmentManager' androidx.fragment.app.FragmentManager)
                          (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0017: CONSTRUCTOR  (r5v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                          (r8v3 'deleteListingManyCallsBottomSheet' com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet A[DONT_INLINE])
                         call: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.a.a(com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, com.forsale.app.datalayer.network.responses.ListingItemDetails, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, androidx.fragment.app.FragmentManager, g00.l):void in method: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2.a(com.forsale.app.datalayer.network.responses.ListingItemDetails, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2$emit$2, state: NOT_LOADED
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
                        	... 21 more
                        */
                    /*
                        this = this;
                        if (r7 == 0) goto L1e
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a r0 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.K
                        com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.ADD_ADDITIONAL_NUMBER
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition.DELETE_ACTION
                        com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet r8 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet.this
                        androidx.fragment.app.FragmentManager r4 = r8.getChildFragmentManager()
                        java.lang.String r8 = "getChildFragmentManager(...)"
                        kotlin.jvm.internal.o.h(r4, r8)
                        com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2$emit$2 r5 = new com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2$emit$2
                        com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet r8 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet.this
                        r5.<init>(r8)
                        r2 = r7
                        r0.a(r1, r2, r3, r4, r5)
                    L1e:
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$2.emit(com.forsale.app.datalayer.network.responses.ListingItemDetails, zz.a):java.lang.Object");
                }
            });
            OneShotEventHandler<ListingItemDetails> C0 = t().C0();
            androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
            o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            C0.h(viewLifecycleOwner3, new FlowCollector<ListingItemDetails>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(ListingItemDetails listingItemDetails, zz.a<? super p> aVar) {
                    if (listingItemDetails != null) {
                        SellerActionBottomSheet.a aVar2 = SellerActionBottomSheet.K;
                        SellerActionType sellerActionType = SellerActionType.HIDE_MY_NUMBER;
                        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = AggregatedAllAnalyticsLogger.AnalyticsPosition.DELETE_ACTION;
                        FragmentManager childFragmentManager = DeleteListingManyCallsBottomSheet.this.getChildFragmentManager();
                        o.h(childFragmentManager, "getChildFragmentManager(...)");
                        final DeleteListingManyCallsBottomSheet deleteListingManyCallsBottomSheet = DeleteListingManyCallsBottomSheet.this;
                        aVar2.a(sellerActionType, listingItemDetails, analyticsPosition, childFragmentManager, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
                              (r0v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a)
                              (r1v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                              (r7v0 'listingItemDetails' com.forsale.app.datalayer.network.responses.ListingItemDetails)
                              (r3v0 'analyticsPosition' com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition)
                              (r4v0 'childFragmentManager' androidx.fragment.app.FragmentManager)
                              (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0017: CONSTRUCTOR  (r5v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                              (r8v3 'deleteListingManyCallsBottomSheet' com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet A[DONT_INLINE])
                             call: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet):void type: CONSTRUCTOR)
                             type: VIRTUAL call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.a.a(com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, com.forsale.app.datalayer.network.responses.ListingItemDetails, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, androidx.fragment.app.FragmentManager, g00.l):void in method: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3.a(com.forsale.app.datalayer.network.responses.ListingItemDetails, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3$emit$2, state: NOT_LOADED
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
                            	... 21 more
                            */
                        /*
                            this = this;
                            if (r7 == 0) goto L1e
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a r0 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.K
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.HIDE_MY_NUMBER
                            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition.DELETE_ACTION
                            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet r8 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet.this
                            androidx.fragment.app.FragmentManager r4 = r8.getChildFragmentManager()
                            java.lang.String r8 = "getChildFragmentManager(...)"
                            kotlin.jvm.internal.o.h(r4, r8)
                            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3$emit$2 r5 = new com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3$emit$2
                            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet r8 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet.this
                            r5.<init>(r8)
                            r2 = r7
                            r0.a(r1, r2, r3, r4, r5)
                        L1e:
                            wz.p r7 = wz.p.f75480a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet$onViewCreated$3.emit(com.forsale.app.datalayer.network.responses.ListingItemDetails, zz.a):java.lang.Object");
                    }
                });
                OneShotEventHandler<Boolean> A0 = t().A0();
                androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
                o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                A0.h(viewLifecycleOwner4, new c());
            }

            @Override // w9.b
            protected int s() {
                return this.f38273x;
            }

            @Override // w9.b
            public boolean w() {
                return this.B;
            }
        }
