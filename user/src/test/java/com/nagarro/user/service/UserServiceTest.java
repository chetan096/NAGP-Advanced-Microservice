package com.nagarro.user.service;

import java.util.Optional;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.nagarro.microservices.advanced.user.models.User;
import com.nagarro.microservices.advanced.user.repositories.IUserRepository;
import com.nagarro.microservices.advanced.user.services.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	@InjectMocks
	private UserServiceImpl target;
	
	@Mock
	private IUserRepository userRepo;
	
	@Test
	public void testGetUserById() {
		Mockito.when(userRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(new User()));
		MatcherAssert.assertThat(target.findUserById(1L), CoreMatchers.is(CoreMatchers.notNullValue()));
	}

}
