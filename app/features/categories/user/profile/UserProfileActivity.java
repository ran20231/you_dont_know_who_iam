package com.forsale.app.features.categories.user.profile;

import aa.i0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import n00.k;
import t9.t0;
import wz.h;
/* compiled from: UserProfileActivity.kt */
/* loaded from: classes2.dex */
public final class UserProfileActivity extends com.forsale.app.features.categories.user.profile.a<i0, SharedUserProfileViewModel> {
    private final h A;
    private final com.forsale.app.features.auth.f B;

    /* renamed from: i  reason: collision with root package name */
    private final h f31138i;

    /* renamed from: j  reason: collision with root package name */
    private final h f31139j;

    /* renamed from: x  reason: collision with root package name */
    private final int f31140x;

    /* renamed from: y  reason: collision with root package name */
    public SharedUserProfileViewModel.a f31141y;

    /* renamed from: z  reason: collision with root package name */
    private final h f31142z;
    static final /* synthetic */ k<Object>[] D = {s.g(new PropertyReference1Impl(UserProfileActivity.class, "authenticatorDelegator", "getAuthenticatorDelegator()Lcom/forsale/app/features/auth/AuthenticationDelegationI;", 0))};
    public static final a C = new a(null);
    public static final int E = 8;

    /* compiled from: UserProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, UserProfileData userProfileData, Integer num, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            aVar.a(context, userProfileData, num);
        }

        public final void a(Context context, UserProfileData userData, Integer num) {
            o.i(context, "<this>");
            o.i(userData, "userData");
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("extra_user_data", userData);
            if (num != null) {
                num.intValue();
                intent.putExtra("extra_item_details_id", num.intValue());
            }
            context.startActivity(intent);
        }

        public final void c(Activity activity, UserProfileData userData) {
            o.i(activity, "<this>");
            o.i(userData, "userData");
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("extra_user_data", userData);
            activity.startActivityForResult(intent, 55);
        }
    }

    public UserProfileActivity() {
        h a11;
        h a12;
        h a13;
        a11 = kotlin.d.a(new g00.a<UserProfileData>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileActivity$userData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final UserProfileData invoke() {
                UserProfileData L0;
                UserProfileActivity userProfileActivity = UserProfileActivity.this;
                Intent intent = userProfileActivity.getIntent();
                o.h(intent, "getIntent(...)");
                L0 = userProfileActivity.L0(intent);
                return L0;
            }
        });
        this.f31138i = a11;
        a12 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileActivity$itemId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                int K0;
                UserProfileActivity userProfileActivity = UserProfileActivity.this;
                Intent intent = userProfileActivity.getIntent();
                o.h(intent, "getIntent(...)");
                K0 = userProfileActivity.K0(intent);
                return Integer.valueOf(K0);
            }
        });
        this.f31139j = a12;
        this.f31140x = t0.f70287r;
        this.f31142z = new s0(s.b(SharedUserProfileViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileActivity$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ UserProfileActivity f31145f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(p pVar, Bundle bundle, UserProfileActivity userProfileActivity) {
                    super(pVar, bundle);
                    this.f31145f = userProfileActivity;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    UserProfileData Q0;
                    int N0;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    SharedUserProfileViewModel.a P0 = this.f31145f.P0();
                    Q0 = this.f31145f.Q0();
                    N0 = this.f31145f.N0();
                    SharedUserProfileViewModel a11 = P0.a(Q0, Integer.valueOf(N0));
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
        a13 = kotlin.d.a(new g00.a<Intent>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileActivity$newFollowStateBundle$2
            @Override // g00.a
            /* renamed from: b */
            public final Intent invoke() {
                return new Intent();
            }
        });
        this.A = a13;
        this.B = new com.forsale.app.features.auth.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K0(Intent intent) {
        return intent.getIntExtra("extra_item_details_id", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserProfileData L0(Intent intent) {
        return (UserProfileData) intent.getParcelableExtra("extra_user_data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.features.auth.e M0() {
        return this.B.d(this, D[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N0() {
        return ((Number) this.f31139j.getValue()).intValue();
    }

    private final Intent O0() {
        return (Intent) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserProfileData Q0() {
        return (UserProfileData) this.f31138i.getValue();
    }

    public final SharedUserProfileViewModel.a P0() {
        SharedUserProfileViewModel.a aVar = this.f31141y;
        if (aVar != null) {
            return aVar;
        }
        o.w("sharedUserProfileVMFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: R0 */
    public SharedUserProfileViewModel x0() {
        return (SharedUserProfileViewModel) this.f31142z.getValue();
    }

    public final void S0(int i11) {
        setResult(-1, O0().putExtra("following_new_state", i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.categories.user.profile.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new UserProfileActivity$onCreate$1(this, null), 3, null);
        setSupportActionBar(((i0) o0()).P);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f31140x;
    }
}
