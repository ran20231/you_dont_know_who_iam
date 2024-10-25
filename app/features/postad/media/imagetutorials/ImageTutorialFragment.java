package com.forsale.app.features.postad.media.imagetutorials;

import aa.y9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.base.fragments.BaseViewModelFragment;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.features.postad.media.imagetutorials.e;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
/* compiled from: ImageTutorialFragment.kt */
/* loaded from: classes2.dex */
public final class ImageTutorialFragment extends BaseViewModelFragment<y9, e> {

    /* renamed from: y  reason: collision with root package name */
    public static final a f35906y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f35907z = 8;

    /* renamed from: i  reason: collision with root package name */
    private final wz.h f35908i;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f35909j;

    /* renamed from: x  reason: collision with root package name */
    private final int f35910x;

    /* compiled from: ImageTutorialFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageTutorialFragment a(CategoryRuleSet.Tutorial tutorial) {
            o.i(tutorial, "tutorial");
            ImageTutorialFragment imageTutorialFragment = new ImageTutorialFragment(null);
            Bundle bundle = new Bundle();
            bundle.putParcelable("IMAGE_TUTORIAL_DATA", tutorial);
            imageTutorialFragment.setArguments(bundle);
            return imageTutorialFragment;
        }
    }

    public /* synthetic */ ImageTutorialFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryRuleSet.Tutorial E() {
        return (CategoryRuleSet.Tutorial) this.f35908i.getValue();
    }

    public final e.a D() {
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: G */
    public e B() {
        return (e) this.f35909j.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.f35910x;
    }

    private ImageTutorialFragment() {
        wz.h a11;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<CategoryRuleSet.Tutorial>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialFragment$tutorial$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CategoryRuleSet.Tutorial invoke() {
                CategoryRuleSet.Tutorial tutorial;
                Bundle arguments = ImageTutorialFragment.this.getArguments();
                if (arguments != null) {
                    tutorial = (CategoryRuleSet.Tutorial) arguments.getParcelable("IMAGE_TUTORIAL_DATA");
                } else {
                    tutorial = null;
                }
                if (!(tutorial instanceof CategoryRuleSet.Tutorial)) {
                    return null;
                }
                return tutorial;
            }
        });
        this.f35908i = a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ImageTutorialFragment f35913f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, ImageTutorialFragment imageTutorialFragment) {
                    super(fragment, bundle);
                    this.f35913f = imageTutorialFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    this.f35913f.D();
                    this.f35913f.E();
                    throw null;
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
        this.f35909j = FragmentViewModelLazyKt.b(this, s.b(e.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.f35910x = t9.t0.f70171a2;
    }
}
