package com.forsale.app.ui.bottomsheets.postadwarning;

import aa.w3;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.ui.bottomsheets.postadwarning.c;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.p;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
/* compiled from: PostAdWarningBottomSheet.kt */
/* loaded from: classes3.dex */
public final class PostAdWarningBottomSheet extends com.forsale.app.ui.bottomsheets.postadwarning.a {
    public static final a B = new a(null);
    public static final int C = 8;
    private w3 A;

    /* renamed from: g  reason: collision with root package name */
    private final p<Integer, String, wz.p> f39056g;

    /* renamed from: h  reason: collision with root package name */
    public c.a f39057h;

    /* renamed from: i  reason: collision with root package name */
    private final h f39058i;

    /* renamed from: j  reason: collision with root package name */
    private final h f39059j;

    /* renamed from: x  reason: collision with root package name */
    private final h f39060x;

    /* renamed from: y  reason: collision with root package name */
    private final h f39061y;

    /* renamed from: z  reason: collision with root package name */
    private final h f39062z;

    /* compiled from: PostAdWarningBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PostAdWarningBottomSheet a(int i11, boolean z11, String detectedPhone, p<? super Integer, ? super String, wz.p> onRemoveDetected) {
            o.i(detectedPhone, "detectedPhone");
            o.i(onRemoveDetected, "onRemoveDetected");
            PostAdWarningBottomSheet postAdWarningBottomSheet = new PostAdWarningBottomSheet(onRemoveDetected, null);
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_PERSONAL", z11);
            bundle.putInt("INVALID_FIELD", i11);
            bundle.putString("DETECTED_PHONE", detectedPhone);
            postAdWarningBottomSheet.setArguments(bundle);
            return postAdWarningBottomSheet;
        }
    }

    /* compiled from: PostAdWarningBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<wz.p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            PostAdWarningBottomSheet.this.dismiss();
            return wz.p.f75480a;
        }
    }

    /* compiled from: PostAdWarningBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<wz.p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            String A = PostAdWarningBottomSheet.this.A();
            if (A != null) {
                PostAdWarningBottomSheet.this.D().w1(A);
            }
            PostAdWarningBottomSheet.this.dismiss();
            return wz.p.f75480a;
        }
    }

    public /* synthetic */ PostAdWarningBottomSheet(p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String A() {
        return (String) this.f39062z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer C() {
        return (Integer) this.f39061y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel D() {
        return (PostAdViewModel) this.f39059j.getValue();
    }

    private final com.forsale.app.ui.bottomsheets.postadwarning.c E() {
        return (com.forsale.app.ui.bottomsheets.postadwarning.c) this.f39058i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G() {
        return ((Boolean) this.f39060x.getValue()).booleanValue();
    }

    public final c.a B() {
        c.a aVar = this.f39057h;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
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
        ViewDataBinding h11 = g.h(inflater, t0.f70281q0, viewGroup, false);
        o.h(h11, "inflate(...)");
        w3 w3Var = (w3) h11;
        this.A = w3Var;
        w3 w3Var2 = null;
        if (w3Var == null) {
            o.w("binding");
            w3Var = null;
        }
        w3Var.f0(E());
        w3 w3Var3 = this.A;
        if (w3Var3 == null) {
            o.w("binding");
        } else {
            w3Var2 = w3Var3;
        }
        return w3Var2.getRoot();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Integer C2;
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        String A = A();
        if (A != null && (C2 = C()) != null) {
            int intValue = C2.intValue();
            p<Integer, String, wz.p> pVar = this.f39056g;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(intValue), A);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<wz.p> h11 = E().h();
        s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        h11.h(viewLifecycleOwner, new b());
        OneShotEventHandler<wz.p> g11 = E().g();
        s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        g11.h(viewLifecycleOwner2, new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PostAdWarningBottomSheet(p<? super Integer, ? super String, wz.p> pVar) {
        h b11;
        h a11;
        h a12;
        h a13;
        this.f39056g = pVar;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdWarningBottomSheet f39069f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdWarningBottomSheet postAdWarningBottomSheet) {
                    super(fragment, bundle);
                    this.f39069f = postAdWarningBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    Integer C;
                    boolean G;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    c.a B = this.f39069f.B();
                    C = this.f39069f.C();
                    o.f(C);
                    int intValue = C.intValue();
                    G = this.f39069f.G();
                    c a11 = B.a(intValue, G);
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
        this.f39058i = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(com.forsale.app.ui.bottomsheets.postadwarning.c.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.f39059j = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$special$$inlined$activityViewModels$default$3
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
        a11 = d.a(new g00.a<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$isPersonal$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                Bundle arguments = PostAdWarningBottomSheet.this.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("IS_PERSONAL") : true);
            }
        });
        this.f39060x = a11;
        a12 = d.a(new g00.a<Integer>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$invalidField$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                Bundle arguments = PostAdWarningBottomSheet.this.getArguments();
                if (arguments != null) {
                    return Integer.valueOf(arguments.getInt("INVALID_FIELD"));
                }
                return null;
            }
        });
        this.f39061y = a12;
        a13 = d.a(new g00.a<String>() { // from class: com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet$detectedPhone$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                Bundle arguments = PostAdWarningBottomSheet.this.getArguments();
                if (arguments != null) {
                    return arguments.getString("DETECTED_PHONE");
                }
                return null;
            }
        });
        this.f39062z = a13;
    }
}
