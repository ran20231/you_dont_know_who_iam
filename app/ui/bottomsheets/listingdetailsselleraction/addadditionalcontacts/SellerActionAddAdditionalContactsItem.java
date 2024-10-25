package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts;

import aa.oj;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionViewModel;
import com.forsale.app.utils.a0;
import com.google.android.material.textfield.TextInputEditText;
import falcon.chat.Chat;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import kr.m;
import pr.a;
import t9.p0;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: SellerActionAddAdditionalContactsItem.kt */
/* loaded from: classes3.dex */
public final class SellerActionAddAdditionalContactsItem extends a<ItemViewHolder> {

    /* renamed from: f */
    private final SellerActionAddAdditionalContactsItemViewModel f38541f;

    /* renamed from: g */
    private final s f38542g;

    /* renamed from: h */
    private final FragmentManager f38543h;

    /* renamed from: i */
    private final SellerActionViewModel f38544i;

    /* renamed from: j */
    private final int f38545j;

    /* renamed from: k */
    private final int f38546k;

    /* compiled from: SellerActionAddAdditionalContactsItem.kt */
    /* loaded from: classes3.dex */
    public static final class ItemViewHolder extends b.c<SellerActionAddAdditionalContactsItem> {

        /* renamed from: a */
        private final oj f38547a;

        /* renamed from: b */
        private final lr.a<m<?>> f38548b;

        /* renamed from: c */
        private final kr.b<m<?>> f38549c;

        /* compiled from: SellerActionAddAdditionalContactsItem.kt */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector<p> {

            /* renamed from: a */
            final /* synthetic */ SellerActionAddAdditionalContactsItem f38550a;

            a(SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
                this.f38550a = sellerActionAddAdditionalContactsItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                this.f38550a.x().v0(false);
                return p.f75480a;
            }
        }

        /* compiled from: SellerActionAddAdditionalContactsItem.kt */
        /* loaded from: classes3.dex */
        public static final class b implements FlowCollector<Boolean> {

            /* renamed from: a */
            final /* synthetic */ SellerActionAddAdditionalContactsItem f38551a;

            b(SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
                this.f38551a = sellerActionAddAdditionalContactsItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Boolean bool, zz.a<? super p> aVar) {
                this.f38551a.x().x0().i(bool);
                return p.f75480a;
            }
        }

        /* compiled from: SellerActionAddAdditionalContactsItem.kt */
        /* loaded from: classes3.dex */
        public static final class c implements c0<List<? extends String>> {

            /* renamed from: b */
            final /* synthetic */ SellerActionAddAdditionalContactsItem f38556b;

            c(SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
                ItemViewHolder.this = r1;
                this.f38556b = sellerActionAddAdditionalContactsItem;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(List<String> list) {
                ItemViewHolder.this.f38548b.q();
                if (list != null) {
                    ItemViewHolder itemViewHolder = ItemViewHolder.this;
                    SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem = this.f38556b;
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        itemViewHolder.f38548b.n(new wg.a(new wg.b((String) it2.next()), sellerActionAddAdditionalContactsItem.w(), sellerActionAddAdditionalContactsItem.z()));
                    }
                }
            }
        }

        /* compiled from: SellerActionAddAdditionalContactsItem.kt */
        /* loaded from: classes3.dex */
        public static final class d implements c0<String> {

            /* renamed from: a */
            final /* synthetic */ SellerActionAddAdditionalContactsItem f38557a;

            d(SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
                this.f38557a = sellerActionAddAdditionalContactsItem;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(String str) {
                SellerActionAddAdditionalContactsItemViewModel.M(this.f38557a.z(), str, false, 2, null);
            }
        }

        /* compiled from: SellerActionAddAdditionalContactsItem.kt */
        /* loaded from: classes3.dex */
        public static final class e implements FlowCollector<String> {

            /* renamed from: a */
            final /* synthetic */ SellerActionAddAdditionalContactsItem f38558a;

            e(SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
                this.f38558a = sellerActionAddAdditionalContactsItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, zz.a<? super p> aVar) {
                if (str != null) {
                    this.f38558a.z().K(str, false);
                }
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ItemViewHolder(aa.oj r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38547a = r3
                lr.a r3 = new lr.a
                r3.<init>()
                r2.f38548b = r3
                kr.b$a r0 = kr.b.f61943t
                kr.b r3 = r0.i(r3)
                r2.f38549c = r3
                r2.l()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem.ItemViewHolder.<init>(aa.oj):void");
        }

        private final void h(final SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
            j(sellerActionAddAdditionalContactsItem);
            sellerActionAddAdditionalContactsItem.z().l().h(sellerActionAddAdditionalContactsItem.w(), new a(sellerActionAddAdditionalContactsItem));
            sellerActionAddAdditionalContactsItem.z().w().h(sellerActionAddAdditionalContactsItem.w(), new FlowCollector<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(final Boolean bool, zz.a<? super p> aVar) {
                    if (bool != null) {
                        SellerActionResultBottomSheet.a aVar2 = SellerActionResultBottomSheet.G;
                        SellerActionType sellerActionType = SellerActionType.ADD_ADDITIONAL_NUMBER;
                        boolean booleanValue = bool.booleanValue();
                        FragmentManager v11 = SellerActionAddAdditionalContactsItem.this.v();
                        final SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem2 = SellerActionAddAdditionalContactsItem.this;
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
                              (r12v2 'sellerActionAddAdditionalContactsItem2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem A[DONT_INLINE])
                              (r11v0 'bool' java.lang.Boolean A[DONT_INLINE])
                             call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem, java.lang.Boolean):void type: CONSTRUCTOR)
                              (40 int)
                              (null java.lang.Object)
                             type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, boolean, boolean, java.lang.String, androidx.fragment.app.FragmentManager, boolean, g00.l, int, java.lang.Object):void in method: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2.a(java.lang.Boolean, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2$emit$2, state: NOT_LOADED
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
                            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.ADD_ADDITIONAL_NUMBER
                            r2 = 0
                            boolean r3 = r11.booleanValue()
                            r4 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem.this
                            androidx.fragment.app.FragmentManager r5 = r12.v()
                            r6 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2$emit$2 r7 = new com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2$emit$2
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem r12 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem.this
                            r7.<init>(r12, r11)
                            r8 = 40
                            r9 = 0
                            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        L20:
                            wz.p r11 = wz.p.f75480a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItem$ItemViewHolder$bindContactItems$2.emit(java.lang.Boolean, zz.a):java.lang.Object");
                    }
                });
                sellerActionAddAdditionalContactsItem.z().y().h(sellerActionAddAdditionalContactsItem.w(), new b(sellerActionAddAdditionalContactsItem));
                sellerActionAddAdditionalContactsItem.z().m().observe(sellerActionAddAdditionalContactsItem.w(), new c(sellerActionAddAdditionalContactsItem));
                sellerActionAddAdditionalContactsItem.z().q().observe(sellerActionAddAdditionalContactsItem.w(), new d(sellerActionAddAdditionalContactsItem));
                sellerActionAddAdditionalContactsItem.z().u().h(sellerActionAddAdditionalContactsItem.w(), new e(sellerActionAddAdditionalContactsItem));
                TextInputEditText textInputEditText = this.f38547a.S;
                if (textInputEditText != null) {
                    textInputEditText.setOnEditorActionListener(new wg.c(sellerActionAddAdditionalContactsItem));
                }
            }

            public static final boolean i(SellerActionAddAdditionalContactsItem item, TextView textView, int i11, KeyEvent keyEvent) {
                o.i(item, "$item");
                if (i11 == 6) {
                    if (item.z().L(textView.getText().toString(), true)) {
                        textView.setText("");
                        textView.clearFocus();
                        item.z().r().postValue(Boolean.TRUE);
                    }
                    return true;
                }
                return false;
            }

            private final void j(SellerActionAddAdditionalContactsItem sellerActionAddAdditionalContactsItem) {
                oj ojVar = this.f38547a;
                ojVar.U(sellerActionAddAdditionalContactsItem.w());
                ojVar.h0(sellerActionAddAdditionalContactsItem.z());
                ojVar.U.setAdapter(this.f38549c);
            }

            private final void l() {
                int dimension = (int) Chat.f55705a.k().getResources().getDimension(p0.f69717q);
                RecyclerView recyclerView = this.f38547a.U;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setHasFixedSize(false);
                recyclerView.j(new a0(dimension, 0, 0, 6, null));
            }

            private final void m() {
                this.f38547a.U.setAdapter(null);
                this.f38548b.r().clear();
                this.f38548b.q();
                this.f38549c.h();
            }

            @Override // kr.b.c
            /* renamed from: k */
            public void b(SellerActionAddAdditionalContactsItem item, List<? extends Object> payloads) {
                o.i(item, "item");
                o.i(payloads, "payloads");
                h(item);
            }

            @Override // kr.b.c
            /* renamed from: n */
            public void e(SellerActionAddAdditionalContactsItem item) {
                o.i(item, "item");
                m();
                item.z().m().removeObservers(item.w());
                item.z().q().removeObservers(item.w());
            }
        }

        public SellerActionAddAdditionalContactsItem(SellerActionAddAdditionalContactsItemViewModel viewModel, s lifecycleOwner, FragmentManager fragmentManager, SellerActionViewModel sellerActionViewModel) {
            o.i(viewModel, "viewModel");
            o.i(lifecycleOwner, "lifecycleOwner");
            o.i(fragmentManager, "fragmentManager");
            o.i(sellerActionViewModel, "sellerActionViewModel");
            this.f38541f = viewModel;
            this.f38542g = lifecycleOwner;
            this.f38543h = fragmentManager;
            this.f38544i = sellerActionViewModel;
            this.f38545j = t0.F4;
            this.f38546k = r0.f70084t7;
        }

        @Override // kr.m
        public int getType() {
            return this.f38546k;
        }

        @Override // pr.a
        public int t() {
            return this.f38545j;
        }

        public final FragmentManager v() {
            return this.f38543h;
        }

        public final s w() {
            return this.f38542g;
        }

        public final SellerActionViewModel x() {
            return this.f38544i;
        }

        @Override // pr.a
        /* renamed from: y */
        public ItemViewHolder u(View v11) {
            o.i(v11, "v");
            oj f02 = oj.f0(v11);
            o.h(f02, "bind(...)");
            return new ItemViewHolder(f02);
        }

        public final SellerActionAddAdditionalContactsItemViewModel z() {
            return this.f38541f;
        }
    }
