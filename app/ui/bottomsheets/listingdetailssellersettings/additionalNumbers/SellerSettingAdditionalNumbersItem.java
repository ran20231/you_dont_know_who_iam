package com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers;

import aa.wl;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: SellerSettingAdditionalNumbersItem.kt */
/* loaded from: classes3.dex */
public final class SellerSettingAdditionalNumbersItem extends a<SellerSettingAdditionalNumbersViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final zg.a f38873f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38874g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f38875h;

    /* renamed from: i  reason: collision with root package name */
    private final l<Boolean, p> f38876i;

    /* renamed from: j  reason: collision with root package name */
    private final int f38877j;

    /* renamed from: k  reason: collision with root package name */
    private final int f38878k;

    /* compiled from: SellerSettingAdditionalNumbersItem.kt */
    /* loaded from: classes3.dex */
    public static final class SellerSettingAdditionalNumbersViewHolder extends b.c<SellerSettingAdditionalNumbersItem> {

        /* renamed from: a  reason: collision with root package name */
        private final wl f38879a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SellerSettingAdditionalNumbersViewHolder(aa.wl r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38879a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem.SellerSettingAdditionalNumbersViewHolder.<init>(aa.wl):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(final SellerSettingAdditionalNumbersItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            wl wlVar = this.f38879a;
            wlVar.U(item.x());
            wlVar.h0(item.f38873f);
            item.f38873f.a().h(item.x(), new FlowCollector<p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(p pVar, zz.a<? super p> aVar) {
                    SellerActionBottomSheet.a aVar2 = SellerActionBottomSheet.K;
                    SellerActionType sellerActionType = SellerActionType.ADD_ADDITIONAL_NUMBER;
                    ListingItemDetails b11 = SellerSettingAdditionalNumbersItem.this.f38873f.b();
                    AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = AggregatedAllAnalyticsLogger.AnalyticsPosition.SETTINGS;
                    FragmentManager w11 = SellerSettingAdditionalNumbersItem.this.w();
                    final SellerSettingAdditionalNumbersItem sellerSettingAdditionalNumbersItem = SellerSettingAdditionalNumbersItem.this;
                    aVar2.a(sellerActionType, b11, analyticsPosition, w11, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
                          (r0v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a)
                          (r1v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                          (r2v0 'b11' com.forsale.app.datalayer.network.responses.ListingItemDetails)
                          (r3v0 'analyticsPosition' com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition)
                          (r4v0 'w11' androidx.fragment.app.FragmentManager)
                          (wrap: g00.l<java.lang.Boolean, wz.p> : 0x001a: CONSTRUCTOR  (r5v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                          (r7v4 'sellerSettingAdditionalNumbersItem' com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem A[DONT_INLINE])
                         call: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.a.a(com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, com.forsale.app.datalayer.network.responses.ListingItemDetails, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, androidx.fragment.app.FragmentManager, g00.l):void in method: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2.a(wz.p, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2$emit$2, state: NOT_LOADED
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
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$a r0 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet.K
                        com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.ADD_ADDITIONAL_NUMBER
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem r7 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem.this
                        zg.a r7 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem.v(r7)
                        com.forsale.app.datalayer.network.responses.ListingItemDetails r2 = r7.b()
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition.SETTINGS
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem r7 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem.this
                        androidx.fragment.app.FragmentManager r4 = r7.w()
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2$emit$2 r5 = new com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2$emit$2
                        com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem r7 = com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem.this
                        r5.<init>(r7)
                        r0.a(r1, r2, r3, r4, r5)
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.additionalNumbers.SellerSettingAdditionalNumbersItem$SellerSettingAdditionalNumbersViewHolder$bindView$2.emit(wz.p, zz.a):java.lang.Object");
                }
            });
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(SellerSettingAdditionalNumbersItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerSettingAdditionalNumbersItem(zg.a viewModel, s lifecycleOwner, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(fragmentManager, "fragmentManager");
        o.i(onActionDone, "onActionDone");
        this.f38873f = viewModel;
        this.f38874g = lifecycleOwner;
        this.f38875h = fragmentManager;
        this.f38876i = onActionDone;
        this.f38877j = t0.f70237j5;
        this.f38878k = r0.O7;
    }

    @Override // kr.m
    public int getType() {
        return this.f38878k;
    }

    @Override // pr.a
    public int t() {
        return this.f38877j;
    }

    public final FragmentManager w() {
        return this.f38875h;
    }

    public final s x() {
        return this.f38874g;
    }

    public final l<Boolean, p> y() {
        return this.f38876i;
    }

    @Override // pr.a
    /* renamed from: z */
    public SellerSettingAdditionalNumbersViewHolder u(View v11) {
        o.i(v11, "v");
        wl f02 = wl.f0(v11);
        o.h(f02, "bind(...)");
        return new SellerSettingAdditionalNumbersViewHolder(f02);
    }
}
