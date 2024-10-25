package com.forsale.app.ui.bottomsheets.postadsuccessuploading;

import aa.a4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.postad.PostAdUtilsKt;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.ui.bottomsheets.postadsuccessuploading.e;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.z0;
import wz.h;
import wz.p;
import z3.i;
/* compiled from: PostAdUploadAdSuccessBottomSheet.kt */
/* loaded from: classes3.dex */
public final class PostAdUploadAdSuccessBottomSheet extends com.forsale.app.ui.bottomsheets.postadsuccessuploading.a {

    /* renamed from: g  reason: collision with root package name */
    private final i f39031g = new i(s.b(com.forsale.app.ui.bottomsheets.postadsuccessuploading.b.class), new g00.a<Bundle>() { // from class: com.forsale.app.ui.bottomsheets.postadsuccessuploading.PostAdUploadAdSuccessBottomSheet$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = Fragment.this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
        }
    });

    /* renamed from: h  reason: collision with root package name */
    private final h f39032h;

    /* renamed from: i  reason: collision with root package name */
    private final h f39033i;

    /* renamed from: j  reason: collision with root package name */
    private a4 f39034j;

    /* renamed from: x  reason: collision with root package name */
    public e.a f39035x;

    /* renamed from: y  reason: collision with root package name */
    private final h f39036y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f39030z = new a(null);
    public static final int A = 8;

    /* compiled from: PostAdUploadAdSuccessBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PostAdUploadAdSuccessBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PostAdUploadAdSuccessBottomSheet.this.dismiss();
            PostAdUtilsKt.a(PostAdUploadAdSuccessBottomSheet.this);
            return p.f75480a;
        }
    }

    public PostAdUploadAdSuccessBottomSheet() {
        h a11;
        h b11;
        a11 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.postadsuccessuploading.PostAdUploadAdSuccessBottomSheet$mediaUploadFailed$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                b A2;
                A2 = PostAdUploadAdSuccessBottomSheet.this.A();
                return Boolean.valueOf(A2.a());
            }
        });
        this.f39032h = a11;
        this.f39033i = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.postadsuccessuploading.PostAdUploadAdSuccessBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.postadsuccessuploading.PostAdUploadAdSuccessBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postadsuccessuploading.PostAdUploadAdSuccessBottomSheet$special$$inlined$activityViewModels$default$3
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
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postadsuccessuploading.PostAdUploadAdSuccessBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdUploadAdSuccessBottomSheet f39043f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdUploadAdSuccessBottomSheet postAdUploadAdSuccessBottomSheet) {
                    super(fragment, bundle);
                    this.f39043f = postAdUploadAdSuccessBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    boolean z11;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    e.a y11 = this.f39043f.y();
                    z11 = this.f39043f.z();
                    e a11 = y11.a(z11);
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
        this.f39036y = FragmentViewModelLazyKt.b(this, s.b(e.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.ui.bottomsheets.postadsuccessuploading.b A() {
        return (com.forsale.app.ui.bottomsheets.postadsuccessuploading.b) this.f39031g.getValue();
    }

    private final e B() {
        return (e) this.f39036y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z() {
        return ((Boolean) this.f39032h.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70793c;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        a4 f02 = a4.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f39034j = f02;
        a4 a4Var = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        f02.h0(B());
        a4 a4Var2 = this.f39034j;
        if (a4Var2 == null) {
            o.w("binding");
        } else {
            a4Var = a4Var2;
        }
        return a4Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> e11 = B().e();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e11.h(viewLifecycleOwner, new b());
    }

    public final e.a y() {
        e.a aVar = this.f39035x;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }
}
