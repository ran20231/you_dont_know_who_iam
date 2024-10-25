package com.forsale.app.features.postad;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.forsale.app.utils.LifeCycleUtilsKt;
import kotlin.jvm.internal.o;
import t9.y0;
/* compiled from: PostAdUtils.kt */
/* loaded from: classes2.dex */
public final class PostAdUtilsKt {
    public static final void a(Fragment fragment) {
        o.i(fragment, "<this>");
        Intent intent = new Intent();
        intent.putExtra("navigatingDeepLink", fragment.getString(y0.B5));
        p requireActivity = fragment.requireActivity();
        requireActivity.setResult(-1, intent);
        requireActivity.finish();
    }

    public static final void b(Fragment fragment, PostAdViewModel viewModel) {
        o.i(fragment, "<this>");
        o.i(viewModel, "viewModel");
        LifeCycleUtilsKt.b(fragment, new PostAdUtilsKt$registerAuthenticationObservers$1(viewModel, fragment, null));
    }

    public static final void c(Fragment fragment, PostAdViewModel viewModel) {
        o.i(fragment, "<this>");
        o.i(viewModel, "viewModel");
        LifeCycleUtilsKt.b(fragment, new PostAdUtilsKt$registerShowingListingSavedDialog$1(viewModel, fragment, null));
    }
}
