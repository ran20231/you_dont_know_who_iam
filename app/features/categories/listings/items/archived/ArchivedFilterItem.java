package com.forsale.app.features.categories.listings.items.archived;

import aa.y0;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange;
import com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet;
import com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType;
import com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel;
import com.forsale.app.utils.LifecycleAware$ViewHolder;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import qc.a;
import t9.t0;
import wz.p;
/* compiled from: ArchivedFilterItem.kt */
/* loaded from: classes2.dex */
public final class ArchivedFilterItem extends a<ViewHolder, p, pc.a> {

    /* renamed from: h  reason: collision with root package name */
    private final pc.a f30577h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30578i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30579j;

    /* compiled from: ArchivedFilterItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends LifecycleAware$ViewHolder<ArchivedFilterItem, y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(y0 binding) {
            super(binding);
            o.i(binding, "binding");
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: i */
        public void b(final ArchivedFilterItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            super.b(item, payloads);
            final y0 f11 = f();
            f11.i0(item.f30577h);
            final pc.a h02 = f11.h0();
            if (h02 != null) {
                h02.g().h(g(), new FlowCollector<p>() { // from class: com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: a */
                    public final Object emit(p pVar, zz.a<? super p> aVar) {
                        s sVar;
                        int selectedId;
                        List e11;
                        s sVar2;
                        sVar = ArchivedFilterItem.this.f30578i;
                        if (sVar instanceof Fragment) {
                            FilterSelectorBottomSheet.Companion companion = FilterSelectorBottomSheet.f38040z;
                            List<MyListingsDateRange> e12 = h02.e();
                            String string = f11.getRoot().getResources().getString(t9.y0.f70432e4);
                            o.h(string, "getString(...)");
                            MyListingsDateRange value = h02.h().getValue();
                            if (value != null) {
                                selectedId = value.getSelectedId();
                            } else {
                                selectedId = h02.f().getSelectedId();
                            }
                            e11 = q.e(kotlin.coroutines.jvm.internal.a.d(selectedId));
                            FilterSelectorModel filterSelectorModel = new FilterSelectorModel(e12, string, e11, FilterSelectorDisplayType.LIST, null, null, null, 112, null);
                            sVar2 = ArchivedFilterItem.this.f30578i;
                            FragmentManager childFragmentManager = ((Fragment) sVar2).getChildFragmentManager();
                            o.h(childFragmentManager, "getChildFragmentManager(...)");
                            final pc.a aVar2 = h02;
                            companion.a(filterSelectorModel, childFragmentManager, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: INVOKE  
                                  (r11v5 'companion' com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$Companion)
                                  (r12v1 'filterSelectorModel' com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel)
                                  (r0v18 'childFragmentManager' androidx.fragment.app.FragmentManager)
                                  (wrap: g00.l<java.util.List<? extends com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange>, wz.p> : 0x006f: CONSTRUCTOR  (r1v2 g00.l<java.util.List<? extends com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange>, wz.p> A[REMOVE]) = (r2v2 'aVar2' pc.a A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1$emit$2.<init>(pc.a):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet.Companion.a(com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel, androidx.fragment.app.FragmentManager, g00.l):void in method: com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1.a(wz.p, zz.a<? super wz.p>):java.lang.Object, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1$emit$2, state: NOT_LOADED
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
                                com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem r11 = com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem.this
                                androidx.lifecycle.s r11 = com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem.w(r11)
                                boolean r11 = r11 instanceof androidx.fragment.app.Fragment
                                if (r11 == 0) goto L75
                                com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$Companion r11 = com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet.f38040z
                                com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel r12 = new com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel
                                pc.a r0 = r2
                                java.util.List r1 = r0.e()
                                aa.y0 r0 = r3
                                android.view.View r0 = r0.getRoot()
                                android.content.res.Resources r0 = r0.getResources()
                                int r2 = t9.y0.f70432e4
                                java.lang.String r2 = r0.getString(r2)
                                java.lang.String r0 = "getString(...)"
                                kotlin.jvm.internal.o.h(r2, r0)
                                pc.a r0 = r2
                                androidx.lifecycle.LiveData r0 = r0.h()
                                java.lang.Object r0 = r0.getValue()
                                com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange r0 = (com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange) r0
                                if (r0 == 0) goto L3c
                                int r0 = r0.getSelectedId()
                                goto L46
                            L3c:
                                pc.a r0 = r2
                                com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange r0 = r0.f()
                                int r0 = r0.getSelectedId()
                            L46:
                                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
                                java.util.List r3 = kotlin.collections.p.e(r0)
                                com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType r4 = com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType.LIST
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 112(0x70, float:1.57E-43)
                                r9 = 0
                                r0 = r12
                                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem r0 = com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem.this
                                androidx.lifecycle.s r0 = com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem.w(r0)
                                androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                                java.lang.String r1 = "getChildFragmentManager(...)"
                                kotlin.jvm.internal.o.h(r0, r1)
                                com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1$emit$2 r1 = new com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1$emit$2
                                pc.a r2 = r2
                                r1.<init>(r2)
                                r11.a(r12, r0, r1)
                            L75:
                                wz.p r11 = wz.p.f75480a
                                return r11
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.archived.ArchivedFilterItem$ViewHolder$bindView$1$1$1.emit(wz.p, zz.a):java.lang.Object");
                        }
                    });
                }
                f11.u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArchivedFilterItem(pc.a viewModel, s lo2) {
            super(viewModel, lo2);
            o.i(viewModel, "viewModel");
            o.i(lo2, "lo");
            this.f30577h = viewModel;
            this.f30578i = lo2;
            this.f30579j = t0.C;
        }

        @Override // pr.a
        public int t() {
            return this.f30579j;
        }

        @Override // pr.a
        /* renamed from: y */
        public ViewHolder u(View v11) {
            o.i(v11, "v");
            y0 f02 = y0.f0(v11);
            o.h(f02, "bind(...)");
            return new ViewHolder(f02);
        }
    }
