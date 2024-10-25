package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import aa.wj;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: SellerActionManualRepostItem.kt */
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItem extends a<ItemViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final SellerActionManualRepostItemViewModel f38705f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38706g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f38707h;

    /* renamed from: i  reason: collision with root package name */
    private final SellerActionViewModel f38708i;

    /* renamed from: j  reason: collision with root package name */
    private final int f38709j;

    /* renamed from: k  reason: collision with root package name */
    private final int f38710k;

    /* compiled from: SellerActionManualRepostItem.kt */
    /* loaded from: classes3.dex */
    public static final class ItemViewHolder extends b.c<SellerActionManualRepostItem> {

        /* renamed from: a  reason: collision with root package name */
        private final wj f38711a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SellerActionManualRepostItem.kt */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector<p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SellerActionManualRepostItem f38712a;

            a(SellerActionManualRepostItem sellerActionManualRepostItem) {
                this.f38712a = sellerActionManualRepostItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                this.f38712a.x().v0(false);
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SellerActionManualRepostItem.kt */
        /* loaded from: classes3.dex */
        public static final class b implements FlowCollector<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SellerActionManualRepostItem f38713a;

            b(SellerActionManualRepostItem sellerActionManualRepostItem) {
                this.f38713a = sellerActionManualRepostItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Boolean bool, zz.a<? super p> aVar) {
                this.f38713a.x().x0().i(bool);
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SellerActionManualRepostItem.kt */
        /* loaded from: classes3.dex */
        public static final class c implements FlowCollector<p> {
            c() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                BuyMoreTokensActivity.a aVar2 = BuyMoreTokensActivity.E;
                Context context = ItemViewHolder.this.f38711a.getRoot().getContext();
                o.h(context, "getContext(...)");
                aVar2.a(context);
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ItemViewHolder(aa.wj r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38711a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem.ItemViewHolder.<init>(aa.wj):void");
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final SellerActionManualRepostItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            wj wjVar = this.f38711a;
            wjVar.U(item.w());
            wjVar.h0(item.z());
            item.z().m().h(item.w(), new a(item));
            item.z().w().h(item.w(), new FlowCollector<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(final Boolean bool, zz.a<? super p> aVar) {
                    if (bool != null) {
                        SellerActionResultBottomSheet.a aVar2 = SellerActionResultBottomSheet.G;
                        SellerActionType sellerActionType = SellerActionType.MANUAL_RE_POST;
                        boolean booleanValue = bool.booleanValue();
                        FragmentManager v11 = SellerActionManualRepostItem.this.v();
                        final SellerActionManualRepostItem sellerActionManualRepostItem = SellerActionManualRepostItem.this;
                        SellerActionResultBottomSheet.a.b(aVar2, sellerActionType, false, booleanValue, null, v11, false, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
                              (r0v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a)
                              (r1v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                              false
                              (r3v0 'booleanValue' boolean)
                              (null java.lang.String)
                              (r5v0 'v11' androidx.fragment.app.FragmentManager)
                              false
                              (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0017: CONSTRUCTOR  (r7v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                              (r12v2 'sellerActionManualRepostItem' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem A[DONT_INLINE])
                              (r11v0 'bool' java.lang.Boolean A[DONT_INLINE])
                             call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem, java.lang.Boolean):void type: CONSTRUCTOR)
                              (40 int)
                              (null java.lang.Object)
                             type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, boolean, boolean, java.lang.String, androidx.fragment.app.FragmentManager, boolean, g00.l, int, java.lang.Object):void in method: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3.a(java.lang.Boolean, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3$emit$2, state: NOT_LOADED
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
                            if (r11 == 0) goto L20
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a r0 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.G
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.MANUAL_RE_POST
                            r2 = 0
                            boolean r3 = r11.booleanValue()
                            r4 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem.this
                            androidx.fragment.app.FragmentManager r5 = r12.v()
                            r6 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3$emit$2 r7 = new com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3$emit$2
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem.this
                            r7.<init>(r12, r11)
                            r8 = 40
                            r9 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        L20:
                            wz.p r11 = wz.p.f75480a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItem$ItemViewHolder$bindView$3.emit(java.lang.Boolean, zz.a):java.lang.Object");
                    }
                });
                item.z().E().h(item.w(), new b(item));
                item.z().s().h(item.w(), new c());
            }

            @Override // kr.b.c
            /* renamed from: h */
            public void e(SellerActionManualRepostItem item) {
                o.i(item, "item");
            }
        }

        public SellerActionManualRepostItem(SellerActionManualRepostItemViewModel viewModel, s lifecycleOwner, FragmentManager fragmentManager, SellerActionViewModel sellerActionViewModel) {
            o.i(viewModel, "viewModel");
            o.i(lifecycleOwner, "lifecycleOwner");
            o.i(fragmentManager, "fragmentManager");
            o.i(sellerActionViewModel, "sellerActionViewModel");
            this.f38705f = viewModel;
            this.f38706g = lifecycleOwner;
            this.f38707h = fragmentManager;
            this.f38708i = sellerActionViewModel;
            this.f38709j = t0.J4;
            this.f38710k = r0.f70136x7;
        }

        @Override // kr.m
        public int getType() {
            return this.f38710k;
        }

        @Override // pr.a
        public int t() {
            return this.f38709j;
        }

        public final FragmentManager v() {
            return this.f38707h;
        }

        public final s w() {
            return this.f38706g;
        }

        public final SellerActionViewModel x() {
            return this.f38708i;
        }

        @Override // pr.a
        /* renamed from: y */
        public ItemViewHolder u(View v11) {
            o.i(v11, "v");
            wj f02 = wj.f0(v11);
            o.h(f02, "bind(...)");
            return new ItemViewHolder(f02);
        }

        public final SellerActionManualRepostItemViewModel z() {
            return this.f38705f;
        }
    }
