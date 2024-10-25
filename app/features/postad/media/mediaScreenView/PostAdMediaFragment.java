package com.forsale.app.features.postad.media.mediaScreenView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.media.MediaStates;
import com.forsale.app.features.postad.media.MediaTypes;
import com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ActionModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ImageModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModel;
import com.forsale.app.ui.dialogs.uploadProgress.UploadProgressDialog;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.facades.ImageEditor;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.designSystem.theme.ThemeKt;
import g00.l;
import g00.q;
import j0.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k10.p;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
/* compiled from: PostAdMediaFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdMediaFragment extends com.forsale.app.features.postad.media.mediaScreenView.a {
    private final androidx.activity.result.b<Intent> A;
    private final androidx.activity.result.b<Intent> B;
    private final androidx.activity.result.b<Intent> C;

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f36183f = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$special$$inlined$activityViewModels$default$3
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

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<Integer> f36184g = StateFlowKt.MutableStateFlow(0);

    /* renamed from: h  reason: collision with root package name */
    private final wz.h f36185h;

    /* renamed from: i  reason: collision with root package name */
    private final wz.h f36186i;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f36187j;

    /* renamed from: x  reason: collision with root package name */
    public PostAdMediaViewModel.a f36188x;

    /* renamed from: y  reason: collision with root package name */
    private final wz.h f36189y;

    /* renamed from: z  reason: collision with root package name */
    private UploadProgressDialog f36190z;

    /* compiled from: PostAdMediaFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements androidx.activity.result.a<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            Intent a11;
            if (activityResult != null && (a11 = activityResult.a()) != null) {
                PostAdMediaFragment postAdMediaFragment = PostAdMediaFragment.this;
                boolean z11 = false;
                boolean booleanExtra = a11.getBooleanExtra(p.a(), false);
                String stringExtra = a11.getStringExtra("output_path");
                if (booleanExtra) {
                    if (!((stringExtra == null || stringExtra.length() == 0) ? true : true) && stringExtra != null) {
                        postAdMediaFragment.O().V0(stringExtra);
                    }
                }
            }
            PostAdMediaFragment.this.O().e1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<Boolean> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            o.f(bool);
            if (bool.booleanValue()) {
                PostAdMediaFragment.this.O().c1();
            }
        }
    }

    /* compiled from: PostAdMediaFragment.kt */
    /* loaded from: classes2.dex */
    static final class c implements androidx.activity.result.a<ActivityResult> {
        c() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            Intent a11;
            int y11;
            if (activityResult != null && (a11 = activityResult.a()) != null) {
                PostAdMediaFragment postAdMediaFragment = PostAdMediaFragment.this;
                PostAdMediaViewModel O = postAdMediaFragment.O();
                List<String> f11 = postAdMediaFragment.J().f(a11);
                y11 = kotlin.collections.s.y(f11, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (String str : f11) {
                    arrayList.add(new File(str).getAbsolutePath());
                }
                O.A0(new ArrayList<>(arrayList));
            }
        }
    }

    /* compiled from: PostAdMediaFragment.kt */
    /* loaded from: classes2.dex */
    static final class d implements androidx.activity.result.a<ActivityResult> {
        d() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            Intent a11;
            Object k02;
            if (activityResult != null && (a11 = activityResult.a()) != null) {
                PostAdMediaFragment postAdMediaFragment = PostAdMediaFragment.this;
                List<String> g11 = postAdMediaFragment.J().g(a11);
                if (!(!g11.isEmpty())) {
                    g11 = null;
                }
                if (g11 != null) {
                    PostAdMediaViewModel O = postAdMediaFragment.O();
                    k02 = CollectionsKt___CollectionsKt.k0(g11);
                    String absolutePath = new File((String) k02).getAbsolutePath();
                    o.h(absolutePath, "getAbsolutePath(...)");
                    O.B0(absolutePath);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f36202a;

        e(l function) {
            o.i(function, "function");
            this.f36202a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f36202a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36202a.invoke(obj);
        }
    }

    public PostAdMediaFragment() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<dj.a>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$fileChooser$2
            @Override // g00.a
            /* renamed from: b */
            public final dj.a invoke() {
                return new dj.a();
            }
        });
        this.f36185h = a11;
        a12 = kotlin.d.a(new g00.a<dj.c>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$imageEditor$2
            @Override // g00.a
            /* renamed from: b */
            public final dj.c invoke() {
                return ImageEditor.f40111a.invoke();
            }
        });
        this.f36186i = a12;
        a13 = kotlin.d.a(new g00.a<dj.e>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$imageViewer$2
            @Override // g00.a
            /* renamed from: b */
            public final dj.e invoke() {
                return dj.d.f54279a.invoke();
            }
        });
        this.f36187j = a13;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdMediaFragment f36197f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdMediaFragment postAdMediaFragment) {
                    super(fragment, bundle);
                    this.f36197f = postAdMediaFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel M;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdMediaViewModel.a I = this.f36197f.I();
                    M = this.f36197f.M();
                    PostAdMediaViewModel a11 = I.a(M);
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
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f36189y = FragmentViewModelLazyKt.b(this, s.b(PostAdMediaViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new c());
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.A = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new a());
        o.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.B = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new d());
        o.h(registerForActivityResult3, "registerForActivityResult(...)");
        this.C = registerForActivityResult3;
    }

    private final AlertModel H(boolean z11) {
        ActionModel actionModel;
        PostAdDialogs postAdDialogs = PostAdDialogs.UploadMediaFailed;
        ImageModel imageModel = new ImageModel(t9.q0.O, null, 2, null);
        TextModel textModel = new TextModel(new TextHolder(Integer.valueOf(y0.Fe), null, null, 6, null), null, 0, 6, null);
        TextModel textModel2 = new TextModel(new TextHolder(Integer.valueOf(y0.Ee), null, null, 6, null), null, 6, 2, null);
        if (z11) {
            actionModel = new ActionModel(new TextHolder(Integer.valueOf(y0.Ce), null, null, 6, null), null, 2, null);
        } else {
            actionModel = new ActionModel(new TextHolder(Integer.valueOf(y0.De), null, null, 6, null), null, 2, null);
        }
        return new AlertModel(true, postAdDialogs, imageModel, textModel, textModel2, null, actionModel, new ActionModel(new TextHolder(Integer.valueOf(y0.Ge), null, null, 6, null), null, 2, null), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dj.a J() {
        return (dj.a) this.f36185h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dj.c K() {
        return (dj.c) this.f36186i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dj.e L() {
        return (dj.e) this.f36187j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel M() {
        return (PostAdViewModel) this.f36183f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        PostAdViewModel.q4(M(), false, MediaTypes.IMAGES, false, true, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        M().g4();
        SupportActivity.a aVar = SupportActivity.f32788x;
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        aVar.a(requireContext);
    }

    private final void T() {
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$1(this, null));
        M().s2().observe(getViewLifecycleOwner(), new b());
        M().j2().observe(getViewLifecycleOwner(), new e(new l<MediaStates, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(MediaStates mediaStates) {
                PostAdMediaViewModel O = PostAdMediaFragment.this.O();
                o.f(mediaStates);
                O.b1(mediaStates);
                if (mediaStates == MediaStates.SUCCESS) {
                    PostAdMediaFragment.this.Y(false);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(MediaStates mediaStates) {
                b(mediaStates);
                return wz.p.f75480a;
            }
        }));
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$4(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$5(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$6(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$7(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$8(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$observeEvents$9(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(int i11) {
        LifeCycleUtilsKt.b(this, new PostAdMediaFragment$refreshProgress$1(this, i11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(final boolean z11) {
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        AlertModel H = H(z11);
        g00.a<wz.p> aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$showAlertMediaError$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdViewModel M;
                if (z11) {
                    this.S();
                    return;
                }
                M = this.M();
                M.R4();
            }
        };
        g00.a<wz.p> aVar3 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$showAlertMediaError$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdMediaFragment.this.Q();
            }
        };
        g00.a<wz.p> aVar4 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$showAlertMediaError$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdMediaFragment.this.Y(false);
            }
        };
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        aVar.b(H, aVar2, aVar3, aVar4, childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(boolean z11) {
        UploadProgressDialog uploadProgressDialog;
        if (z11) {
            UploadProgressDialog uploadProgressDialog2 = this.f36190z;
            if (uploadProgressDialog2 != null) {
                uploadProgressDialog2.show();
            }
        } else if (!z11 && (uploadProgressDialog = this.f36190z) != null) {
            uploadProgressDialog.dismiss();
        }
    }

    public final PostAdMediaViewModel.a I() {
        PostAdMediaViewModel.a aVar = this.f36188x;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final PostAdMediaViewModel O() {
        return (PostAdMediaViewModel) this.f36189y.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(-1147677519, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1147677519, i11, -1, "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment.onCreateView.<anonymous>.<anonymous> (PostAdMediaFragment.kt:82)");
                }
                final PostAdMediaFragment postAdMediaFragment = PostAdMediaFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -82702406, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-82702406, i12, -1, "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PostAdMediaFragment.kt:83)");
                        }
                        float f11 = 24;
                        androidx.compose.ui.c m11 = PaddingKt.m(ScrollKt.f(BackgroundKt.b(androidx.compose.ui.c.f7566a, dk.a.f54291a.a(aVar2, dk.a.f54292b).e().h(aVar2, yj.d.f76453b), null, 2, null), ScrollKt.c(0, aVar2, 0, 1), false, null, false, 14, null), 0.0f, e2.h.l(f11), 0.0f, e2.h.l(32), 5, null);
                        Arrangement.f o11 = Arrangement.f3698a.o(e2.h.l(f11));
                        PostAdMediaFragment postAdMediaFragment2 = PostAdMediaFragment.this;
                        aVar2.C(-483455358);
                        a0 a11 = androidx.compose.foundation.layout.e.a(o11, v0.b.f74009a.k(), aVar2, 6);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(m11);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar = w.f.f74891a;
                        ImagesViewKt.a(postAdMediaFragment2.O(), aVar2, 8);
                        VideoViewKt.a(postAdMediaFragment2.O(), aVar2, 8);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        T();
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.a("post ad media", new l<tn.b, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                PostAdViewModel M;
                o.i(logScreenVisited, "$this$logScreenVisited");
                M = PostAdMediaFragment.this.M();
                logScreenVisited.b("intention", M.k2().name());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(tn.b bVar) {
                b(bVar);
                return wz.p.f75480a;
            }
        });
    }
}
