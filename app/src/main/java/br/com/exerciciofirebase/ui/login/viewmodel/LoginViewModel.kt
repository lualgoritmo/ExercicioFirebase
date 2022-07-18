package br.com.exerciciofirebase.ui.login.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.exerciciofirebase.domain.model.User
import br.com.exerciciofirebase.domain.repository.AuthenticationRepository

class LoginViewModel : ViewModel() {
    private val authRepository = AuthenticationRepository()
    private var _userLoginTo = MutableLiveData<User>()
    val userLoginTo: LiveData<User> = _userLoginTo

    private var _errorState = MutableLiveData<String>()
    val errorState: LiveData<String> = _errorState
}