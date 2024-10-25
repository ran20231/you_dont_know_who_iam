package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter;

import aa.mk;
import android.content.Context;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.more.WebModel;
import com.forsale.app.ui.WebDialogFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import g00.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import pb.g;
import wz.p;
/* compiled from: SliderVirtualTourViewHolder.kt */
/* loaded from: classes2.dex */
public final class SliderVirtualTourViewHolder extends RecyclerView.d0 {

    /* renamed from: a  reason: collision with root package name */
    private final mk f27574a;

    /* renamed from: b  reason: collision with root package name */
    private final s f27575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderVirtualTourViewHolder(mk binding, s lifeCycle) {
        super(binding.getRoot());
        o.i(binding, "binding");
        o.i(lifeCycle, "lifeCycle");
        this.f27574a = binding;
        this.f27575b = lifeCycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str, a<p> aVar) {
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper;
        Context context;
        FragmentManager supportFragmentManager;
        Context context2 = this.f27574a.getRoot().getContext();
        d dVar = null;
        if (context2 instanceof ViewComponentManager.FragmentContextWrapper) {
            fragmentContextWrapper = (ViewComponentManager.FragmentContextWrapper) context2;
        } else {
            fragmentContextWrapper = null;
        }
        if (fragmentContextWrapper != null) {
            context = fragmentContextWrapper.getBaseContext();
        } else {
            context = null;
        }
        if (context instanceof d) {
            dVar = context;
        }
        if (dVar != null && (supportFragmentManager = dVar.getSupportFragmentManager()) != null) {
            WebDialogFragment.C.a(new WebModel("", null, str, false, 10, null), true, supportFragmentManager, aVar);
        }
    }

    public final void b(final g virtualViewModel) {
        o.i(virtualViewModel, "virtualViewModel");
        mk mkVar = this.f27574a;
        mkVar.U(this.f27575b);
        this.f27574a.f0(virtualViewModel);
        mkVar.u();
        virtualViewModel.b().h(this.f27575b, new FlowCollector<String>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, zz.a<? super p> aVar) {
                final long currentTimeMillis = System.currentTimeMillis();
                if (str != null) {
                    SliderVirtualTourViewHolder sliderVirtualTourViewHolder = SliderVirtualTourViewHolder.this;
                    final g gVar = virtualViewModel;
                    sliderVirtualTourViewHolder.c(str, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: INVOKE  
                          (r6v1 'sliderVirtualTourViewHolder' com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder)
                          (r5v0 'str' java.lang.String)
                          (wrap: g00.a<wz.p> : 0x000c: CONSTRUCTOR  (r2v0 g00.a<wz.p> A[REMOVE]) = (r3v0 'gVar' pb.g A[DONT_INLINE]), (r0v0 'currentTimeMillis' long A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2$emit$2.<init>(pb.g, long):void type: CONSTRUCTOR)
                         type: DIRECT call: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder.c(java.lang.String, g00.a):void in method: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2.a(java.lang.String, zz.a<? super wz.p>):java.lang.Object, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2$emit$2, state: NOT_LOADED
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
                        long r0 = java.lang.System.currentTimeMillis()
                        if (r5 == 0) goto L12
                        com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder r6 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder.this
                        com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2$emit$2 r2 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2$emit$2
                        pb.g r3 = r2
                        r2.<init>(r3, r0)
                        com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder.a(r6, r5, r2)
                    L12:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter.SliderVirtualTourViewHolder$bind$2.emit(java.lang.String, zz.a):java.lang.Object");
                }
            });
        }
    }
