package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost;

import aa.sj;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
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
/* compiled from: SellerActionAutoRepostItem.kt */
/* loaded from: classes3.dex */
public final class SellerActionAutoRepostItem extends a<SellerActionAutoRepostItemViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final SellerActionAutoRepostItemViewModel f38605f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38606g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f38607h;

    /* renamed from: i  reason: collision with root package name */
    private final SellerActionViewModel f38608i;

    /* renamed from: j  reason: collision with root package name */
    private final int f38609j;

    /* renamed from: k  reason: collision with root package name */
    private final int f38610k;

    /* compiled from: SellerActionAutoRepostItem.kt */
    /* loaded from: classes3.dex */
    public static final class SellerActionAutoRepostItemViewHolder extends b.c<SellerActionAutoRepostItem> {

        /* renamed from: a  reason: collision with root package name */
        private final sj f38611a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SellerActionAutoRepostItem.kt */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector<p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SellerActionAutoRepostItem f38612a;

            a(SellerActionAutoRepostItem sellerActionAutoRepostItem) {
                this.f38612a = sellerActionAutoRepostItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                this.f38612a.x().v0(false);
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SellerActionAutoRepostItem.kt */
        /* loaded from: classes3.dex */
        public static final class b implements FlowCollector<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SellerActionAutoRepostItem f38613a;

            b(SellerActionAutoRepostItem sellerActionAutoRepostItem) {
                this.f38613a = sellerActionAutoRepostItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Boolean bool, zz.a<? super p> aVar) {
                this.f38613a.x().x0().i(bool);
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SellerActionAutoRepostItemViewHolder(aa.sj r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38611a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem.SellerActionAutoRepostItemViewHolder.<init>(aa.sj):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(final SellerActionAutoRepostItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            sj sjVar = this.f38611a;
            sjVar.U(item.w());
            sjVar.h0(item.z());
            item.z().i().h(item.w(), new a(item));
            item.z().l().h(item.w(), new FlowCollector<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(final Boolean bool, zz.a<? super p> aVar) {
                    if (bool != null) {
                        SellerActionResultBottomSheet.a aVar2 = SellerActionResultBottomSheet.G;
                        SellerActionType sellerActionType = SellerActionType.AUTO_RE_POST;
                        boolean j11 = SellerActionAutoRepostItem.this.z().j();
                        boolean booleanValue = bool.booleanValue();
                        FragmentManager v11 = SellerActionAutoRepostItem.this.v();
                        final SellerActionAutoRepostItem sellerActionAutoRepostItem = SellerActionAutoRepostItem.this;
                        SellerActionResultBottomSheet.a.b(aVar2, sellerActionType, j11, booleanValue, null, v11, false, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: INVOKE  
                              (r0v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a)
                              (r1v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                              (r2v0 'j11' boolean)
                              (r3v0 'booleanValue' boolean)
                              (null java.lang.String)
                              (r5v0 'v11' androidx.fragment.app.FragmentManager)
                              false
                              (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0020: CONSTRUCTOR  (r7v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                              (r12v4 'sellerActionAutoRepostItem' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem A[DONT_INLINE])
                              (r11v0 'bool' java.lang.Boolean A[DONT_INLINE])
                             call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem, java.lang.Boolean):void type: CONSTRUCTOR)
                              (40 int)
                              (null java.lang.Object)
                             type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, boolean, boolean, java.lang.String, androidx.fragment.app.FragmentManager, boolean, g00.l, int, java.lang.Object):void in method: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3.a(java.lang.Boolean, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3$emit$2, state: NOT_LOADED
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
                            if (r11 == 0) goto L29
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a r0 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.G
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.AUTO_RE_POST
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem.this
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItemViewModel r12 = r12.z()
                            boolean r2 = r12.j()
                            boolean r3 = r11.booleanValue()
                            r4 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem.this
                            androidx.fragment.app.FragmentManager r5 = r12.v()
                            r6 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3$emit$2 r7 = new com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3$emit$2
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem.this
                            r7.<init>(r12, r11)
                            r8 = 40
                            r9 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        L29:
                            wz.p r11 = wz.p.f75480a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItem$SellerActionAutoRepostItemViewHolder$bindView$3.emit(java.lang.Boolean, zz.a):java.lang.Object");
                    }
                });
                item.z().o().h(item.w(), new b(item));
            }

            @Override // kr.b.c
            /* renamed from: g */
            public void e(SellerActionAutoRepostItem item) {
                o.i(item, "item");
            }
        }

        public SellerActionAutoRepostItem(SellerActionAutoRepostItemViewModel viewModel, s lifecycleOwner, FragmentManager fragmentManager, SellerActionViewModel sellerActionViewModel) {
            o.i(viewModel, "viewModel");
            o.i(lifecycleOwner, "lifecycleOwner");
            o.i(fragmentManager, "fragmentManager");
            o.i(sellerActionViewModel, "sellerActionViewModel");
            this.f38605f = viewModel;
            this.f38606g = lifecycleOwner;
            this.f38607h = fragmentManager;
            this.f38608i = sellerActionViewModel;
            this.f38609j = t0.H4;
            this.f38610k = r0.f70110v7;
        }

        @Override // kr.m
        public int getType() {
            return this.f38610k;
        }

        @Override // pr.a
        public int t() {
            return this.f38609j;
        }

        public final FragmentManager v() {
            return this.f38607h;
        }

        public final s w() {
            return this.f38606g;
        }

        public final SellerActionViewModel x() {
            return this.f38608i;
        }

        @Override // pr.a
        /* renamed from: y */
        public SellerActionAutoRepostItemViewHolder u(View v11) {
            o.i(v11, "v");
            sj f02 = sj.f0(v11);
            o.h(f02, "bind(...)");
            return new SellerActionAutoRepostItemViewHolder(f02);
        }

        public final SellerActionAutoRepostItemViewModel z() {
            return this.f38605f;
        }
    }
