package com.forsale.app.features.categories.listings.adminlistingdetails;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.core.util.ContextExtensionKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import m9.f;
import t9.t0;
import wz.h;
/* compiled from: AdminListingDetailsActivity.kt */
/* loaded from: classes2.dex */
public final class AdminListingDetailsActivity extends com.forsale.app.features.categories.listings.adminlistingdetails.d<aa.a, AdminListingDetailsViewModel> {

    /* renamed from: y  reason: collision with root package name */
    public static final a f28038y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f28039z = 8;

    /* renamed from: j  reason: collision with root package name */
    public AdminListingDetailsViewModel.a f28041j;

    /* renamed from: i  reason: collision with root package name */
    private final int f28040i = t0.f70168a;

    /* renamed from: x  reason: collision with root package name */
    private final h f28042x = new s0(s.b(AdminListingDetailsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AdminListingDetailsActivity f28045f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, AdminListingDetailsActivity adminListingDetailsActivity) {
                super(pVar, bundle);
                this.f28045f = adminListingDetailsActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                AdminListingDetailsViewModel a11 = this.f28045f.G0().a(this.f28045f.getIntent().getIntExtra("ADV_ID", -1), (ListingItemBrief) this.f28045f.getIntent().getParcelableExtra("ADV_OBJECT"));
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
            return new a(p.this, p.this.getIntent().getExtras(), this);
        }
    }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));

    /* compiled from: AdminListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdminListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<String> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            if (str != null) {
                f.l(AdminListingDetailsActivity.this, str);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdminListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<String> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            WebActivity.a.d(WebActivity.I, AdminListingDetailsActivity.this, WebType.ITEM, "", str, 0, null, 24, null);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdminListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<wz.p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            AdminListingDetailsActivity.this.finish();
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(AdminListingDetailsActivity this$0, View view) {
        o.i(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void J0() {
        x0().z0().h(this, new FlowCollector<String>() { // from class: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, zz.a<? super wz.p> aVar) {
                if (str != null) {
                    final AdminListingDetailsActivity adminListingDetailsActivity = AdminListingDetailsActivity.this;
                    ContextExtensionKt.a(adminListingDetailsActivity, str, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
                          (r3v1 'adminListingDetailsActivity' com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity)
                          (r2v0 'str' java.lang.String)
                          (wrap: g00.l<java.lang.Exception, wz.p> : 0x0006: CONSTRUCTOR  (r0v0 g00.l<java.lang.Exception, wz.p> A[REMOVE]) = 
                          (r3v1 'adminListingDetailsActivity' com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1$emit$2.<init>(com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity):void type: CONSTRUCTOR)
                         type: STATIC call: com.forsale.core.util.ContextExtensionKt.a(android.content.Context, java.lang.String, g00.l):void in method: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1.a(java.lang.String, zz.a<? super wz.p>):java.lang.Object, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1$emit$2, state: NOT_LOADED
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
                        if (r2 == 0) goto Lc
                        com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity r3 = com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity.this
                        com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1$emit$2 r0 = new com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1$emit$2
                        r0.<init>(r3)
                        com.forsale.core.util.ContextExtensionKt.a(r3, r2, r0)
                    Lc:
                        wz.p r2 = wz.p.f75480a
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsActivity$setupBinding$1.emit(java.lang.String, zz.a):java.lang.Object");
                }
            });
            x0().B0().h(this, new b());
            x0().C0().h(this, new c());
            x0().x0().h(this, new d());
        }

        public final AdminListingDetailsViewModel.a G0() {
            AdminListingDetailsViewModel.a aVar = this.f28041j;
            if (aVar != null) {
                return aVar;
            }
            o.w("adminListingDetailsVMFactory");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.base.activities.BaseViewModelActivity
        /* renamed from: H0 */
        public AdminListingDetailsViewModel x0() {
            return (AdminListingDetailsViewModel) this.f28042x.getValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.features.categories.listings.adminlistingdetails.d, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            ((aa.a) o0()).Q.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.categories.listings.adminlistingdetails.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminListingDetailsActivity.I0(AdminListingDetailsActivity.this, view);
                }
            });
            J0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.base.activities.BasePlainActivity
        public int p0() {
            return this.f28040i;
        }
    }
